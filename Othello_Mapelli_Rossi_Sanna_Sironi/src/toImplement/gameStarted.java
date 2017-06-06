
package toImplement;

import model.ClasseModel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
/**
 *
 * @author Joker
 */
public class gameStarted {
     private PrintWriter send; //l'oggetto per scrivere sulla socket
     private BufferedReader read;// l'oggetto per leggere dalla socekt
    /**
     * costruttore per stampare le informazioni della connessione e salvare quest'ultime nella classe del model.
     * @param s Socket della connessione stabilita
     * @param ip Stringa della porta della connessione
     * @param port Int della porta della connessione
     */
    public gameStarted(Socket s,String ip, int port){
        ClasseModel.gameStarted = true;
        ClasseModel.socket = s;
        ClasseModel.ip = ip;
        ClasseModel.port = port;
        System.out.println("INFORMAZIONI SULLA CONNESSIONE \nIP Address: " + ip + "\nPort Number: " + port + "\nSocket " + s);
        try{
            send= new PrintWriter(ClasseModel.socket.getOutputStream(), true);
            read = new BufferedReader(new InputStreamReader(ClasseModel.socket.getInputStream()));
            startGame();
        }
        catch(Exception ex){ System.out.println("ECCEZIONE nella creazione degli oggetti per leggere e scrivere sulla socket"); }
    }
    /**
     * metodo per iniziare il gioco
     */
    private void startGame(){
        /* SCRIVETE LE REGOLE DEL PROTOCOLLO */
    }
}