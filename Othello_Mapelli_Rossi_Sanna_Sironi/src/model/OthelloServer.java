package model;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OthelloServer extends Thread{

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

            Partita P1 = new Partita(id);

            Scanner sc1 = new Scanner(client1.getInputStream());
            Scanner sc2 = new Scanner(client2.getInputStream());

            int c1 = sc1.nextInt();
            int c2 = sc2.nextInt();

            System.out.print("c1 dice stocazzo: " + c1 + " e c2 pure : " + c2);

            //while (true) {
            //  out.println(in.readLine());
            //}
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
