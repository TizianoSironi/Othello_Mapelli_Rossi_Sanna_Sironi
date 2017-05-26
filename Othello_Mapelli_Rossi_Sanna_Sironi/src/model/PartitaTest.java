/*
 * La classe PartitaTest serve solamente per creare una partita testuale e fare delle prove sulla logica del gioco,
 * ad esempio, capire velocemente se funziona il controllo della mossa senza creare ogni volta una partita dal server.
 */
package model;

/**
 *
 * @author AlessandroAchille
 * 
**/

public class PartitaTest {
    public static void main (String arg[]){
        Partita partita = new Partita("Partita di Testo");
        System.out.println();
        System.out.println();
        
        if (partita.campo.controllaValiditàMossa(2, 6, "N", 1)){
            System.out.println("Figa è vero!");
        }
        
        for (int r=0; r<8; r++){
            for (int c=0; c<8; c++){
                if (partita.campo.mosseValide[r][c]){
                        System.out.print ("t | ");
                } else {
                        System.out.print ("f | ");
                }
            }
            System.out.println();
        }
    }
}
