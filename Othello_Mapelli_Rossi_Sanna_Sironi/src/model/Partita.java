/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rossi.alessandroachi
 */
public class Partita {
    Scacchiera campo;
    String giocatore1;
    String giocatore2;
    String ipGiocatore1;
    String ipGiocatore2;
    int idPartita;
    String colGiocatore1;
    String colGiocatore2;
    public Partita(int id){
      campo = new Scacchiera();  
      //Avviare la Socket
      //La Socket prende i dati e li assegna 
      //giocatore1, giocatore2, ipGiocatore1, ipGiocatore2
      idPartita=id;
    }
}
