package view;

import javax.swing.JButton;

/**
 *
 * @author Joker
 */
public class Box extends JButton{
    static int dimensione;
    static String Color;
    /**
     *  - colore
     *  - 
     */
    
    public Box(){
        
    }
    
    public String changeStatus(){
        return Color;
    }
    
    public int Dimension(){
        return dimensione;
    }
}

