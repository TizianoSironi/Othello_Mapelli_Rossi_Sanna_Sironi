package model;

public class ServerModel extends Thread{
        
   public static void main (String arg[]){
       int contatorePartite=0;
      Partita p1 = new Partita(contatorePartite);
      p1.campo.print();
      System.out.println("");
      p1.campo.controllaValidita("N");
   } 
    
    @Override
    public void run(){
        
    }
}
