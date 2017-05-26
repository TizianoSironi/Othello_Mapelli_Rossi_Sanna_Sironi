/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rossi.alessandroachi
 */
public class Scacchiera {
    
    Casella mappa [][];
    boolean mosseValide [][];
    final int HR_DX = 0; 
    final int HR_SX = 1;
    final int VR_AT = 2; 
    final int VR_BS = 3;
    final int OB_AD = 4; 
    final int OB_AS = 5;
    final int OB_BD = 6; 
    final int OB_BS = 7;
    public Scacchiera(){
        mappa = new Casella [8][8];
        mosseValide = new boolean [8][8];
        for (int r=0; r<8; r++){
            for (int c=0; c<8; c++){
                   mappa [r][c] = new Casella(r,c);
                mosseValide [r][c] = false;
            }
        }
        //getCasella (4,4).cambiaColore("B");
        //getCasella (4,5).cambiaColore("B");
        //getCasella (5,4).cambiaColore("B");
        //getCasella (5,5).cambiaColore("B");
        //getCasella (2,4).cambiaColore("B");
        //getCasella (1,5).cambiaColore("N");
      //fff  getCasella (3,5).cambiaColore("B");
        //getCasella (3,6).cambiaColore("B");
        getCasella (4,4).cambiaColore("N");
        //getCasella (3,8).cambiaColore("N");
       
//getCasella (1,4).cambiaColore("N");
        /*
        getCasella (5,5).cambiaColore("B");
        getCasella (6,4).cambiaColore("N");
        getCasella (4,4).cambiaColore("B");
        getCasella (4,5).cambiaColore("N");
        //getCasella (5,4).cambiaColore("B");
        getCasella (5,5).cambiaColore("B");
        getCasella (6,4).cambiaColore("N");
        */
        
    }
    
    public void print(){
        for (int r=0; r<8; r++){
            for (int c=0; c<8; c++){
                System.out.print(mappa [r][c]);
                System.out.print(" | ");
            }
            System.out.println ();
        }
    }
    
    public Casella getCasella (int r, int c){
        return mappa[r-1][c-1];
    }
    public void setCasella (int r, int c, Casella cas){
        mappa [r-1] [c-1] = cas;
    }
    
    public int getPedineNere(){
        int cont=0;
        for (int r=0; r<8; r++){
            for (int c=0; c<8; c++){
                if (mappa[r][c].toString().equals("N")){
                    cont++;
                }
            }
        }
        return cont;
    }
    
    public int getPedineBianche(){
        int cont=0;
        for (int r=0; r<8; r++){
            for (int c=0; c<8; c++){
                if (mappa[r][c].toString().equals("B")){
                    cont++;
                }
            }
        }
        return cont;
    }
    
    public void mosseValide(String turno){
        for (int r=0; r<8; r++){
            for (int c=0; c<8; c++){
                for (int i=0; i<8; i++){
                    if (controllaValiditàMossa(r,c,turno,i)){
                        mosseValide[r][c]=true;
                        System.out.println("HO TROVATO UNA CASELLA CHE é VALIDA+++++++++++++++++++++++++++++++      "+r + c);
                    }
                }
            }
        }
    }
    /**
     * 
     * @param x Coordinate x della casella nella quale voglio mettere la pedina
     * @param y Coordinate x della casella nella quale voglio mettere la pedina
     * @param turno Indica chi è il colore che vuole mettere la pedina nella casella
     * @param dir Indica in che direzione controllare la mosssa
     * @return true se si può metterla, false se non è possibile metterla
     */
    public boolean controllaValiditàMossa(int x, int y, String turno, int dir){
        
        if (!mappa[x][y].casellaVuota()){
            return false;
        } else {
            int newX = 0;
            int newY = 0;
            int newnewX = 0;
            int newnewY = 0;
            switch (dir) {
                case HR_DX:
                     newX = x;
                     newnewX = x;
                     newY = y + 1;
                     newnewY = y + 2;
                     System.out.println("Controllo la validità nel senso ->");
                    break;
                case HR_SX:
                     newX = x;
                     newnewX = x;
                     newY = y - 1;
                     newnewY = y - 2;
                     System.out.println("Controllo la validità nel senso ->");
                    break;
                case VR_BS:
                    newX = x + 1;
                    newnewX = x+2;
                    newY = y;
                    newnewY = y;
                    System.out.println("Controllo la validità nel senso V");
                    break;
                case VR_AT:
                    newX = x-1;
                    newY = y;
                    newnewX = x-2;
                    newnewY = y;
                    System.out.println("Controllo la validità nel senso ^");
                    break;
                case OB_AD:
                    newX = x-1;
                    newY = y+1;
                    newnewX = x-2;
                    newnewY = y+2;
                    System.out.println("Controllo la validità nel senso OB_AD");
                    break;
                case OB_AS:
                    newX = x-1;
                    newY = y-1;
                    newnewX = x-2;
                    newnewY = y-2;
                    System.out.println("Controllo la validità nel senso OB_AS");
                    break;
                case OB_BD:
                    newX = x+1;
                    newY = y-1;
                    newnewX = x+2;
                    newnewY = y-2;
                    System.out.println("Controllo la validità nel senso OB_BD");
                    break;
                case OB_BS:
                    newX = x+1;
                    newY = y-1;
                    newnewX = x+2;
                    newnewY = y-2;
                    System.out.println("Controllo la validità nel senso OB_BS");
                    break;
               
            }
            if (newY > 7||newX > 7||newY < 0||newX < 0) {
                System.out.println("Sto sforando le dimensioni della mappa (1)");
                return false;
            } else{
                if ((!mappa[newX][newY].toString().equals(turno))) {
                if (newnewX>7||newnewY>7||newnewX<0||newnewY<0) {
                    System.out.println("Sto sforando le dimensioni della mappa (2)");
                    return false;
                    
                } else {
                    System.out.println("Inizio il controllo ricorsivo");
                    return step2controlloValiditàMossa(newnewX, newnewY, turno, dir);
                }
            } else {
                return false;
            }
           }
        }
    }

    private boolean step2controlloValiditàMossa(int x, int y, String turno, int dir){
        
        int newX = 0;
        int newY = 0;
            switch (dir) {
                case HR_DX:
                     newX = x;
                     newY = y + 1;
                    break;
                case HR_SX:
                     newX = x;
                     newY = y - 1;
                    break;
                case VR_BS:
                    newX = x + 1;
                    newY = y;
                    break;
                case VR_AT:
                    newX = x-1;
                    newY = y;
                    break;
                case OB_AD:
                    newX = x-1;
                    newY = y+1;
                    break;
                case OB_AS:
                    newX = x-1;
                    newY = y-1;
                    break;
                case OB_BD:
                    newX = x+1;
                    newY = y-1;
                    break;
                case OB_BS:
                    newX = x+1;
                    newY = y-1;
                    break;
               
            }
       
            if (mappa[x][y].toString().equals(turno)){
                System.out.println("Va bene, mossa valida");
                return true;
            } else if (mappa[x][y].casellaVuota()){
                System.out.println("Hai vicino una casella vuota, non puoi mettere la pedina");
                return false;
            } else {
                if (newX > 7||newY > 7||newX < 0||newY < 0){
                    System.out.println("Stai sforando le dimensioni della mappa");
                    return false;
            } else{
                    System.out.println("Hai vicino una casella del colore opposto, continuo controllo ricorsivo");
                    return step2controlloValiditàMossa(newX, newY, turno, dir);
                }
            }
    }
    
    /**
     * 
     * @deprecated Non funzionante 
     */
    public void controllaValidita(String turno){
        for (int r=1; r<7; r++){ //Controllo dalla riga 1 alla riga 6
            for (int c=1; c<7; c++){ //Controllo dalla colonna 1 alla colonna 6
                if (mappa[r][c].casellaVuota()){ //Controlla se la casella è vuota
                   // if (!mappa[r][c].toString().equals(turno)){ //Controlla se la casella non è dello stesso colore di chi sta giocando
                   
                            if (!mappa[r+1][c].toString().equals(turno)){ //Controlla se la casella non è dello stesso colore di chi sta giocando
                                    for (int r1=(r+1); r1<7&&!mosseValide[r][c]; r1++){ //Controlla se la casella ↓↓ è dello stesso colore di chi sta giocando oppure se ci siano delle altre pedine di altri colori seguite da un'opposto                                   
                                        //Controlare se vuota
                                        if (!mappa[r1][c].casellaVuota()){
                                        if(mappa[r1+1][c].toString().equals(turno)){
                                            mosseValide[r][c]=true;
                                            System.out.println("è vero!");
                                        }
                                        } else {
                                            r1=7;
                                        }
                                        /*if(!mappa[r1][c].toString().equals(turno)){
                                            mosseValide[r][c]=false;
                                        }*/
                                    }
                            
                            }
                        
                }
                        if (!mappa[r+1][c+1].casellaVuota()){ //Controlla mossa in diagonale ↘ 
                            if (!mappa[r+1][c+1].toString().equals(turno)){ //Controlla se la casella non è dello stesso colore di chi sta giocando
                                if(mappa[r+2][c+2].toString().equals(turno)){ //Controlla se la casella ↘↘ è dello stesso colore di chi sta giocando 
                                    mosseValide[r][c]=true;
                                }
                            }
                        }
                        if (!mappa[r-1][c].casellaVuota()){ //Controlla mossa in alto ↑
                            if (!mappa[r-1][c].toString().equals(turno)){ //Controlla se la casella non è dello stesso colore di chi sta giocando
                                if(mappa[r-2][c].toString().equals(turno)){ //Controlla se la casella ↑↑ è dello stesso colore di chi sta giocando
                                    mosseValide[r][c]=true;
                            }
                            }
                        } 
                        if (!mappa[r-1][c-1].casellaVuota()){ //Controlla mossa in diagonale 	↖
                            if (!mappa[r-1][c-1].toString().equals(turno)){ //Controlla se la casella non è dello stesso colore di chi sta giocando
                                if(mappa[r-2][c-2].toString().equals(turno)){ //Controlla se la casella ↖↖  è dello stesso colore di chi sta giocando
                                mosseValide[r][c]=true;
                            }  
                            }
                        }
                        if (!mappa[r][c+1].casellaVuota()){ //Controlla mossa a destra →
                            if (!mappa[r][c+1].toString().equals(turno)){ //Controlla se la casella non è dello stesso colore di chi sta giocando
                                if(mappa[r][c+2].toString().equals(turno)){ //Controlla se la casella →→ è dello stesso colore di chi sta gicocando
                                    mosseValide[r][c]=true;
                                }
                            }
                        }
                        if (!mappa[r][c-1].casellaVuota()){ //Controlla mossa a sinistra ←
                            if (!mappa[r][c-1].toString().equals(turno)){ //Controlla se la casella non è dello stesso colore di chi sta giocando
                                if(mappa[r][c-2].toString().equals(turno)){ //Controlla se la casella ←← è dello stesso colore di chi sta giocando
                                    mosseValide[r][c]=true;
                                }
                            }
                        }
                        if (!mappa[r+1][c-1].casellaVuota()){ //Controlla mossa in diagonale ↙
                            if (!mappa[r+1][c-1].toString().equals(turno)){ //Controlla se la casella non è dello stesso colore di chi sta giocando
                                if(mappa[r+2][c-2].toString().equals(turno)){ //Controlla se la ↗ casella è dello stesso colore di chi sta giocando
                                    mosseValide[r][c]=true;                           
                                }

                            }
                        }
                        if (!mappa[r-1][c+1].casellaVuota()){ //Controlla mossa in diagonale ↗
                            if (!mappa[r-1][c+1].toString().equals(turno)){ //Controlla se la casella non è dello stesso colore di chi sta giocando
                                if(mappa[r-2][c+2].toString().equals(turno)){ //Controlla se la casella ↙ è dello stesso colore di chi sta giocando
                                    mosseValide[r][c]=true;                                   
                                }
                            }
                        }
                //}
            }
        }

        
        for (int r=0; r<8; r++){
            for (int c=0; c<8; c++){
                if (mosseValide [r][c]){
                    System.out.print("t");
                } else {
                   System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println ();
        }
}
}
