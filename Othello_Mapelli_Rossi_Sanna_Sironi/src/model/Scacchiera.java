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
    public Scacchiera(){
        mappa = new Casella [8][8];
        for (int r=0; r<8; r++){
            for (int c=0; c<8; c++){
                mappa [r][c] = new Casella(r,c);
            }
        }
        getCasella (4,4).cambiaColore("B");
        getCasella (4,5).cambiaColore("N");
        getCasella (5,4).cambiaColore("N");
        getCasella (5,5).cambiaColore("B");
        
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
}
