/*
 * La classe PartitaTest serve solamente per creare una partita testuale e fare delle prove sulla logica del gioco,
 * ad esempio, capire velocemente se funziona il controllo della mossa senza creare ogni volta una partita dal server.
 */
package model;

import java.util.Scanner;

/**
 *
 * @author AlessandroAchille ROSSI
 * 
**/

public class PartitaTest {
    /*public static void main (String arg[]){
        Partita partita = new Partita("Partita di Testo");
        System.out.println();
        System.out.println();
        Scanner sc = new Scanner (System.in);
        partita.campo.calcolaMosseValide("N");
        do{
            String oppC;
            int a = sc.nextInt();
            int b = sc.nextInt();
            String c = sc.next();
            partita.campo.calcolaMosseValide(c);
            partita.campo.posizionaNuovaCasella(a, b, c);
            if (c.equals("N")){
                oppC = "B";
            } else{
                oppC ="N";
            }
            partita.campo.print();
            partita.campo.calcolaMosseValide(oppC);
    } while (partita.inCorso());
}*/
}
