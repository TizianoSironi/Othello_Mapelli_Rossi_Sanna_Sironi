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
            
                
    }   
}
