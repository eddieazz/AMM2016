/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.model;

/**
 *
 * @author edoar
 */
public class Prodotto {
    /* Attributi */
    private int id;
    private Giocattolo giocattolo;
    private int prezzo;
    private int quantita;
    private String descrizione;
    
    /* Metodi */
    
    /**
     * @return the giocattoloId
     */
    public Giocattolo getGiocattoloId() {
        return giocattolo;
    }
    
    /**
     * @param giocattoloId the giocattoloId to set
     */
    public void setGiocattoloId(Giocattolo giocattolo) {
        this.giocattolo = giocattolo;
    }
    
    /**
     * @return the prezzo
     */
    public int getPrezzo() {
        return prezzo;
    }    
    
    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }    
    
    /**
     * @return the quantita
     */
    public int getQuantita() {
        return quantita;
    }

    /**
     * @param quantita the quantita to set
     */
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    } 
    
    /**
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * @param descrizione the descrizione to set
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }        
        


    
    
    
}
