package model;

public class ServerModel extends Thread{
        
   public static void main (String arg[]){
      Partita p1 = new Partita(new String());
      System.out.println("");
      p1.campo.controllaValidita("N");
   } 
    
    @Override
    public void run(){
        
    }
}
