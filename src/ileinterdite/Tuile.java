/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Tuile.Etat.*;
import java.util.ArrayList;

public class Tuile {

    public int idtuile;
    public Etat etat;
    public String nomTuile;

    Tuile(int idtuile, String nomTuile, Etat etat) {
        this.idtuile = idtuile;
        this.nomTuile = nomTuile;
        this.etat = etat;
    }

    public enum Etat {
        assechée, innondé, coulée
    };

    public int getIdtuile() {
        return idtuile;
    }

    public boolean isHeliport() {
        return this.nomTuile.equalsIgnoreCase("Heliport");
    }

    public String getNomTuile() {
        return nomTuile;
    }

    public Etat getEtat() {
        return this.etat;
    }

    //Constructeur--------------------------------------------------------
    public void setInnondée() {
        this.etat = innondé;
    }

    public void setAssechee() {
        this.etat = assechée;
    }

    public void setCoulée() {
        this.etat = coulée;
    }

//    private String[] nomTuilesTresor = {"Le temple de la lune", "Le temple du soleil", "Le jardin des murmures", "Le jardin des hurlements",
//        "La caverne du brasier", "La caverne des ombres", "Le palais des marées", "Le palais de corail"};


}
