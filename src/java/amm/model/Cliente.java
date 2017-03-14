/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.model;
import java.util.ArrayList;
/**
 *
 * @author edoardo
 */
public class Cliente extends Utente{
    /* Attributi */
    private ArrayList<Prodotto> prodottiComprati = new ArrayList<Prodotto>();
    
    /* Costruttore */
    public Cliente()
    {
        super();
    }
    
    /* Metodi */
    /**
     * @return the prodottiComprati
     */
    public ArrayList<Prodotto> getProdottiComprati() {
        return prodottiComprati;
    }

    /**
     * @param prodottiComprati the prodottiComprati to set
     */
    public void getProdottiComprati(ArrayList<Prodotto> prodottiComprati) {
        this.prodottiComprati = prodottiComprati;
    }
}
