package model;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author sironi.tiziano
 */
public class Server {

    public static void main(String arg[]) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            int partita = 0;
            System.out.println("OthelloServer started.");
            System.out.println("In ascolto sulla porta 9999");
            while (true) {
                System.out.println("Pronto per una partita...");
                Socket c1 = ss.accept();
                System.out.println("Client 1 si è connesso. In attesa di client 2.");
                Socket c2 = ss.accept();
                System.out.println("Client 2 si è connesso. Ora creo una nuova partita.");

                new OthelloServer(c1, c2, String.valueOf(partita)).start();
                partita++;
            }
        } catch (Exception ex) {
            System.out.println("ECCEZZIONE metodo run " + ex);
        }

    }
}
