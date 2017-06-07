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
 *
 */
public class PartitaTest {

    public static void main(String arg[]) {
        Partita partita = new Partita("Partita di Test");
        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        partita.campo.calcolaMosseValide("N");
        System.out.println("Benventuto.. Per iniziare a giocare scrivi le coordinate x della casella nella quale vuoi posizionare la pedina, quindi premi invio.");
        System.out.println("Poi scrivi le coordinate y, e premi invio; ed infine il colore (B oppure N) del colore della pedina.");
        try {
        do {
            
                String oppC;
                int a = sc.nextInt();
                int b = sc.nextInt();
                String c = sc.next().toUpperCase();
                partita.campo.calcolaMosseValide(c);
                partita.campo.posizionaNuovaCasella(a, b, c);
                if (c.equals("N")) {
                    oppC = "B";
                } else {
                    oppC = "N";
                }
                partita.campo.print();
                partita.campo.calcolaMosseValide(oppC);
            
        } while (partita.inCorso());
        int pedineBianche = partita.campo.getPedineBianche();
        int pedineNere = partita.campo.getPedineNere();
        if (pedineBianche > pedineNere) {
            System.out.println("Ha vinto il giocatore Bianco!");
            System.out.println("Numero Pedine Bianche: " + pedineBianche);
            System.out.println("Numero Pedine Nere: " + pedineNere);
        } else if (pedineNere > pedineBianche) {
            System.out.println("Ha vinto il giocatore Nere!");
            System.out.println("Numero Pedine Bianche: " + pedineBianche);
            System.out.println("Numero Pedine Nere: " + pedineNere);
        } else {
            System.out.println("Partita finita in parità.");
            System.out.println("Numero Pedine Bianche: " + pedineBianche);
            System.out.println("Numero Pedine Nere: " + pedineNere);
        }
        } catch (Exception exc) {
                System.out.println("Generata un'eccezione non gestita. Le info di seguit potrebbero aiutare nel rispoverla.");
                exc.printStackTrace();
            }
    }
        
}
