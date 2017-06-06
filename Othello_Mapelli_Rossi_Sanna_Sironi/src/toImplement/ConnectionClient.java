package toImplement;

import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author sironi.tiziano
 */
public class ConnectionClient {
    public ConnectionClient(){
        System.out.println("|--------------------------|");
        System.out.println("| CONNESSIONE MULTIPLAYER  |");
        System.out.println("|--------------------------|");
        System.out.print("Inserisci l'indirizzo IP del server: ");
        String ip = new Scanner(System.in).next();
        int port;
        try{
            System.out.print("Inserisci la porta per la connessione al server: ");
            port = new Scanner(System.in).nextInt();
            //start socket
            try{  
                System.out.println("creazione socket");
                Socket s = new Socket(ip,port);
                System.out.println("socket creata");
                new Client(s,ip,port);
            }
            catch(Exception ex){ System.out.println("ECCEZIONE socket inizio connessione \n " + ex); }
        }
        catch(Exception ex){ System.out.println("ECCEZIONE lettura porta \n "+ ex); }
        
    }
}
