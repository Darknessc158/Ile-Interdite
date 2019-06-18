/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Tuile.Etat.*;
import java.util.ArrayList;

public class Tuile {

    private int idtuile;
    private String nomTuile;
    private Etat etat;
    private Event event;

    Tuile(int idtuile, String nomTuile, Etat etat, Event event) {
        this.idtuile = idtuile;
        this.nomTuile = nomTuile;
        this.etat = etat;
        this.event = event;
    }
    
    public enum Event{
        SPAWN_ROUGE, SPAWN_ORANGE, SPAWN_VIOLET, SPAWN_JAUNE, SPAWN_BLEU, SPAWN_VERT
        ,TRESOR_PIERRE, TRESOR_ZEPHYR, TRESOR_CRISTAL, TRESOR_CALICE;
    }

    public enum Etat {
        assechée, innondé, coulée
    }

    public int getIdtuile() {
        return idtuile;
    }

    public String getNomTuile() {
        return nomTuile;
    }

    public Etat getEtat() {
        return this.etat;
    }

    public Event getEvent() {
        return event;
    }
    

    //Setters--------------------------------------------------------
    public void setInnondée() {
        this.etat = innondé;
    }

    public void setAssechee() {
        this.etat = assechée;
    }

    public void setCoulée() {
        this.etat = coulée;
    }

}
