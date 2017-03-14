/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.model;
import java.util.ArrayList;
/**
 *
 * @author Edoardo
 */
public class Venditore extends Utente{
    /* Attributi */
    private ArrayList<Giocattolo> giocattoliVenduti = new ArrayList<Giocattolo>(); 
    
    /* Costruttore */
    public Venditore()
    {
        super();
    }  
    
    /* Metodi */

    /**
     * @return the giocattoliSpecifici
     */
    public ArrayList<Giocattolo> getGiocattoliVenduti() {
        return giocattoliVenduti;
    }

    /**
     * @param giocattoliSpecifici the giocattoliSpecifici to set
     */
    public void setGiocattoliVenduti(ArrayList<Giocattolo> giocattoliSpecifici) {
        this.giocattoliVenduti = giocattoliSpecifici;
    }
}
