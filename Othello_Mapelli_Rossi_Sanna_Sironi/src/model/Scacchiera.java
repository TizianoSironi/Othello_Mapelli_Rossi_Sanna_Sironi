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
        getCasella (3,4).cambiaColore("B");
        getCasella (4,4).cambiaColore("B");
        getCasella (5,4).cambiaColore("N");
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
                                            r1 =7;
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
