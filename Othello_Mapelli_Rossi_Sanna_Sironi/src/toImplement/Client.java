
package toImplement;

import view.Game;
import model.ClasseModel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import static model.Client.server;
import model.Scacchiera;
/**
 *
 * @author Joker
 */
public class Client {
     private PrintStream serverOutput; //l'oggetto per scrivere sulla socket
     private BufferedReader serverInput;// l'oggetto per leggere dalla socekt
     private String idClient;
     private Scacchiera campo;
     int cordX;
     int cordY;
     Game g;
    /**
     * costruttore per stampare le informazioni della connessione e salvare quest'ultime nella classe del model.
     * @param s Socket della connessione stabilita
     * @param ip Stringa della porta della connessione
     * @param port Int della porta della connessione
     */
    public Client(Socket s,String ip, int port, Game g){
        ClasseModel.gameStarted = true;
        ClasseModel.socket = s;
        ClasseModel.ip = ip;
        ClasseModel.port = port;
        System.out.println("INFORMAZIONI SULLA CONNESSIONE \nIP Address: " + ip + "\nPort Number: " + port + "\nSocket " + s);
     
    }

    
    /**
     * metodo per iniziare il gioco
     */
    private void startGame(){
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
                            //String buttonPushed;  Game.getButtonPushed();
                            serverOutput.println("place: <"+cordX+">, <"+cordY+">;");
                            messaggioServer=serverInput.readLine();
                            
                        }while (!messaggioServer.startsWith("update: "));
                            int cordX = Integer.parseInt(messaggioServer.substring(14, 15));
                            int cordY = Integer.parseInt(messaggioServer.substring(19, 20));
                            String col = messaggioServer.substring(9, 10);
                            campo.posizionaNuovaCasella(cordX, cordY, col);
                            aggiornaVisualizzazioneBottoni();
                    } else{
                        do{
                           System.out.println("Non è il mio turno.. aspetto");
                           disabilitaTuttiiBottoni();
                           messaggioServer=serverInput.readLine();
                           int cordX = Integer.parseInt(messaggioServer.substring(14, 15));
                           int cordY = Integer.parseInt(messaggioServer.substring(19, 20));
                           System.out.println(cordX);
                           System.out.println(cordY);
                           System.out.println (messaggioServer.substring(9,10));
                           String col = messaggioServer.substring(9,20);
                           campo.posizionaNuovaCasella (cordX, cordY, col);
                           aggiornaVisualizzazioneBottoni();
                           System.out.println(messaggioServer.startsWith("update: ")+" non è il mio turno");
                        }while (messaggioServer.startsWith("update: ")==false);
                    }
                }while (true); //Controllare se la partita è ancora aperta
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
    
    
    public void aggiornaVisualizzazioneBottoni(){
        for (int r=0; r<7; r++){
            for (int c=0; c<7; c++){
                if (campo.getCasella(r+1,c+1).equals("N")){
                    Game.bottoni[r][c].setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/black.png")));
                    Game.bottoni[r][c].setEnabled(false);
                } else if (campo.getCasella(r+1,c+1).equals("B")){
                    Game.bottoni[r][c].setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/white.png")));
                    Game.bottoni[r][c].setEnabled(false);
            } else if (campo.getCasella(r+1,c+1).casellaVuota()){
                    Game.bottoni[r][c].setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png")));
                    Game.bottoni[r][c].setEnabled(true);
            }
            }
        }
}
    public void disabilitaTuttiiBottoni(){
        for(int r=0; r<7; r++){
            for (int c=0; c<7; c++){
                Game.bottoni[r][c].setEnabled(false);
            }
        }
    }
    
    
            
}