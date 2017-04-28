package model;

public class ServerModel extends Thread{
    static int righe = 8;
    static int colonne = 8;
    static String giocatore;
    static String colore;
    static int bianco = 0;
    static int nero = 1;
    static int scacchiera[][] = new int [righe][colonne]; 
    
   public static void main (String arg[]){
       int contatorePartite=0;
      Partita p1 = new Partita(contatorePartite);
   } 
    
    @Override
    public void run(){
        
    }
}
