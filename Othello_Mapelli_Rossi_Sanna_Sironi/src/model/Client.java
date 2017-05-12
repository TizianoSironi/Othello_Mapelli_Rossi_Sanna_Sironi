package model;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    public static void main (String [] args) throws UnknownHostException, IOException{
        
        int Numero;
        System.out.println("Client startato ");
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("10.1.33.13",9999);
        Scanner sc1 = null;
        PrintStream p = null;
        try {
            sc1 = new Scanner(s.getInputStream());
            p = new PrintStream(s.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Numero: ");
        Numero = sc.nextInt();
        p.println(Numero);

    }
}
