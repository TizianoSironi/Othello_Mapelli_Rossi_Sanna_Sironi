package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;
import java.net.*;

public class Client {
    public static Socket server;
    public static void main(String[] args) {
        String indIP = "";
        int Numero;
        String idClient ="";
        
        
        System.out.println("Client startato. Attendo al connessione di un altro giocatore.");
        Scanner sc = new Scanner(System.in);
       
            System.out.println("Inserisci l'indririzzo IP del server: ");
            indIP = sc.next();
            try{
               server = new Socket(indIP, 9999); 
            }
            catch(NullPointerException ex1){ System.out.println("CLIENT : eccezione NullPointerException"); }
            catch(Exception ex){ System.out.println(ex); }
            
            BufferedReader serverInput; 
            PrintStream serverOutput;
            try {
                serverInput = new BufferedReader (new InputStreamReader(server.getInputStream()));
                serverOutput = new PrintStream(server.getOutputStream());
                String messaggioServer;
                
                do{
                    messaggioServer=serverInput.readLine();
                    if (messaggioServer.startsWith("start: ")){
                        idClient=messaggioServer.substring(messaggioServer.length()-3, messaggioServer.length()-2);
                        System.out.println("Connesso al server. Sono il giocatore "+idClient);
                    }
                } while (!(idClient.equals("B")||idClient.equals("N")));
                
                do{
                    messaggioServer=serverInput.readLine();
                    System.out.println("ho letto");
                    System.out.println(messaggioServer);
                    if(messaggioServer.equals("round: <"+idClient+">;")){    
                        do{
                            System.out.println("Inserisci le coordinate della prossima mossa");
                            int cordX = sc.nextInt();
                            int cordY = sc.nextInt();
                            serverOutput.println("place: <"+cordX+">, <"+cordY+">;");
                            messaggioServer=serverInput.readLine();
                            System.out.println(messaggioServer.startsWith("update: ")+" è il mio turno");
                        }while (!messaggioServer.startsWith("update: "));
                            //Bisogna estrarre le coordinate da update e stampare la mappa
                    } else{
                        do{
                           System.out.println("Non è il mio turno.. aspetto");
                           messaggioServer=serverInput.readLine();
                           int cordX = Integer.parseInt(messaggioServer.substring(14, 15));
                           int cordY = Integer.parseInt(messaggioServer.substring(19, 20));
                           System.out.println(cordX);
                           System.out.println(cordY);
                           System.out.println (messaggioServer.substring(9,10));
                           //Bisogna stampare la mappa ed aggiornarla con le coordinate
                           System.out.println(messaggioServer.startsWith("update: ")+" non è il mio turno");
                        }while (messaggioServer.startsWith("update: ")==false);
                    }
                }while (true); //Controllare se la partita è ancora aperta
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }   
}
