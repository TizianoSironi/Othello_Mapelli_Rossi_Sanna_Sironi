/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author rossi.alessandroachi
 */
public class Server {
    public static void main (String arg[]) throws IOException{
        ServerSocket ss = new ServerSocket(9999);
        while (true) {
            new OthelloServer(ss.accept()).start();
        }  
}
}
