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
public class Partita {
    Scacchiera campo;
    String idPartita;
    String turno;
    boolean partitaAperta;
    public Partita(String id){
      campo = new Scacchiera(); 
      campo.print();
      idPartita=id;
      partitaAperta=true;
    }
    public boolean inCorso(){
        boolean temp= true;
        for (int r=0; ((r<8) && (temp == true)); r++){
            for (int c=0; ((c<8)&&(temp==true)); c++){
               /* if(campo.mappa[r][c].casellaVuota()){
                    temp=false;
                }*/
                if(campo.mosseValide[r][c]){
                    System.out.println(r + ", " + c +" : " + campo.mosseValide[r][c] );
                    temp=false;
                }
            }
        }
        partitaAperta = !temp;
        //System.out.println(!temp ? "partita aperta" : " partita chiusa" );
        return partitaAperta;
    }
    
    public int getPedineNere(){
        return campo.getPedineNere();
    }
    
    public int getPedineBianche(){
        return campo.getPedineBianche();
    }
    
    /*public void nuovaPedina(int r, int c){
        if(campo.controllaValidita(r,c,turno)){
            campo.getCasella(r, c).cambiaColore(turno);
        }
    }*/
}
