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

    private Socket s;

    public OthelloServer(Socket s) {

        this.s = s;
    }

    @Override
    public void run() {

        try {
            String id = null;
            int connessioni = 0;
            ServerSocket server = new ServerSocket(9999);
            System.out.println("sono server apro socket 9999 e aspetto");
            Socket clients[] = new Socket[2];

            while (connessioni < 2) {
                clients[connessioni] = server.accept();
                connessioni++;
            }

            System.out.println("due client si sono connessi");

            Partita P1 = new Partita(id);

            Scanner sc1 = new Scanner(clients[0].getInputStream());
            Scanner sc2 = new Scanner(clients[1].getInputStream());

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
