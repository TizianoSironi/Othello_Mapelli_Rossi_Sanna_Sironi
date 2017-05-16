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
            System.out.println("due client si sono connessi");

            Partita partita = new Partita(id);

            BufferedReader client1Input = new BufferedReader(new InputStreamReader(client1.getInputStream()));
            BufferedReader client2Input = new BufferedReader(new InputStreamReader(client2.getInputStream()));
            PrintStream client1Output = new PrintStream (client1.getOutputStream());
            PrintStream client2Output = new PrintStream (client2.getOutputStream());
            
           
            if(client1Input.readLine().equals("connection;")){
                System.out.println("Primo giocatore connesso, in attesa del secondo giocatore.");
            }
            if(client2Input.readLine().equals("connection;")){
                System.out.println("Secondo giocatore connesso, inizio la partita");
            }
            client1Output.print("start: <"+id+">, <N>;");
            client2Output.print("start: <"+id+">, <B>;");
            do{
                do{
                    String messaggioC1 = client1Input.readLine();
                    int cordX = Integer.parseInt(messaggioC1.substring(10, 10));
                    int cordY = Integer.parseInt(messaggioC1.substring(15, 15));
                    if (true){
                        client1Output.print("update: <N>, <"+cordX+">, <"+cordY+">;");
                        client2Output.print("update: <N>, <"+cordX+">, <"+cordY+">;");
                    } else {
                        client1Output.print("move not valid;");
                    }
                }while (false); //Controllare se la mossa è valida
            } while (partita.inCorso());
            
           
            
           // System.out.print("c1 dice: " + c1 + " e c2 pure : " + c2);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
