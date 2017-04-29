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
public class Casella {
    boolean libero;
    String Colore;
    int riga;
    int colonna;
    public Casella (int r, int c){
        libero = true;
        Colore = " ";
    }
    public Casella (int r, int c, String col){ 
        libero = false;
        Colore = col;
    }
    
    public void cambiaColore (String col){
        Colore = col;
        libero=false;
    }
  
    public boolean casellaVuota(){
        return libero;
    }
    @Override
    public String toString (){
        return Colore;
    }
}
