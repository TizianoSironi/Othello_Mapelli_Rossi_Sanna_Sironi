/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author rossi.alessandroachi
 */
public class Server {
    public static void main (String arg[]) throws IOException{
        ServerSocket ss = new ServerSocket(9999);
        int partita=0;
        while (true){
                System.out.println("sono server apro socket 9999 e aspetto");
                Socket c1 = ss.accept();
                Socket c2 = ss.accept();
            
            new OthelloServer(c1,c2, String.valueOf(partita)).start();
            partita++;
        }
}
}
