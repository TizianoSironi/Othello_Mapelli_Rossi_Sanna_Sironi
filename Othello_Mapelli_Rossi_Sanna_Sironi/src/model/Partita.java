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
    String giocatore1;
    String giocatore2;
    String ipGiocatore1;
    String ipGiocatore2;
    String idPartita;
    String colGiocatore1;
    String colGiocatore2;
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
                if(campo.mappa[r][c].casellaVuota()){
                    temp=false;
                }
                if(campo.mosseValide[r][c]){
                    temp=false;
                }
            }
        }
        partitaAperta = !temp;
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
