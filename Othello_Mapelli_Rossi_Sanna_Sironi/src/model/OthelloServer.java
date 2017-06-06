package model;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OthelloServer extends Thread {

    private Socket client1;
    private Socket client2;

    private String id;

    public OthelloServer(Socket c1, Socket c2, String str) {
        client1 = c1;
        client2 = c2;
        id = str;
    }

    @Override
    public void run() {

        try {

            /*while (connessioni < 2) {
                clients[connessioni] = server.accept();
                connessioni++;
            }*/
            System.out.println("Due client si sono connessi");

            Partita partita = new Partita(id);

            BufferedReader client1Input = new BufferedReader(new InputStreamReader(client1.getInputStream()));
            BufferedReader client2Input = new BufferedReader(new InputStreamReader(client2.getInputStream()));
            PrintStream client1Output = new PrintStream(client1.getOutputStream());
            PrintStream client2Output = new PrintStream(client2.getOutputStream());

            /*if(client1Input.readLine().equals("connection;")){
                System.out.println("Primo giocatore connesso, in attesa del secondo giocatore.");
            }
            if(client2Input.readLine().equals("connection;")){
                System.out.println("Secondo giocatore connesso, inizio la partita");
            }*/
            client1Output.println("start: <" + id + ">, <N>;");
            System.out.println("client1Output: start: <" + id + ">, <N>;");
            client2Output.println("start: <" + id + ">, <B>;");
            System.out.println("client2Output: start: <" + id + ">, <B>;");
            int i = 0;
            do {
                while (i % 2 == 0) { //Se la partita è in corso oppure la mossa non è valida
                    i++;
                    client1Output.println("round: <N>;");
                    System.out.println("client1Output: round: <N>;");
                    client2Output.println("round: <N>;");
                    System.out.println("client2Output: round: <N>;");
                    String messaggioC1 = client1Input.readLine();
                    System.out.println("client1Input: " + messaggioC1);
                    int cordX = Integer.parseInt(messaggioC1.substring(8, 9));
                    int cordY = Integer.parseInt(messaggioC1.substring(13, 14));
                    if (true) { //Se la mossa è valida
                        client1Output.println("update: <N>, <" + cordX + ">, <" + cordY + ">;");
                        System.out.println("client1Output: update: <N>, <" + cordX + ">, <" + cordY + ">;");
                        client2Output.println("update: <N>, <" + cordX + ">, <" + cordY + ">;");
                        System.out.println("client2Output: update: <N>, <" + cordX + ">, <" + cordY + ">;");
                        partita.campo.getCasella(cordX, cordY).cambiaColore("N");
                    } else {
                        client1Output.println("move not valid;");
                        System.out.println("client1Output: move not valid;");
                    }
                }
                partita.campo.print();

                while (i % 2 == 1) { //Se la partita è in corso oppure la mossa non è valida
                    i++;
                    client1Output.println("round: <B>;");
                    System.out.println("client1Output: round: <B>;");
                    client2Output.println("round: <B>;");
                    System.out.println("client2Output: round: <B>;");
                    String messaggioC2 = client2Input.readLine();
                    System.out.println("client2Input:" + messaggioC2);
                    int cordX = Integer.parseInt(messaggioC2.substring(8, 9));
                    int cordY = Integer.parseInt(messaggioC2.substring(13, 14));
                    if (true) { //Se la mossa è valida
                        client1Output.println("update: <B>, <" + cordX + ">, <" + cordY + ">;");
                        System.out.println("client1Output: update: <B>, <" + cordX + ">, <" + cordY + ">;");
                        client2Output.println("update: <B>, <" + cordX + ">, <" + cordY + ">;");
                        System.out.println("client2Output: update: <B>, <" + cordX + ">, <" + cordY + ">;");
                        partita.campo.getCasella(cordX, cordY).cambiaColore("B");
                    } else {
                        client2Output.println("move not valid;");
                        System.out.println("client2Output: move not valid;");
                    }
                }

            } while (partita.inCorso());
            int pedineBianche = partita.getPedineBianche();
            int pedineNere = partita.getPedineNere();
            client1Output.println("end: black, <" + pedineNere + ">, white, <" + pedineBianche + ">;");
            System.out.println("client1Output: end: black, <" + pedineNere + ">, white, <" + pedineBianche + ">;");
            client2Output.println("end: black, <" + pedineNere + ">, white, <" + pedineBianche + ">;");
            System.out.println("client1Output: end: black, <" + pedineNere + ">, white, <" + pedineBianche + ">;");

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
