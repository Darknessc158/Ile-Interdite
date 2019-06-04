/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import IleInterdite.Utils.EtatTuile;
import java.util.ArrayList;

public class Tuile {

    public int idtuile;
    public boolean heliport;
    public String nomTuile;
    private ArrayList<Tuile> TuilesTresor;
    private EtatTuile etat;

    public int getIdtuile() {
        return idtuile;
    }

    public boolean isHeliport() {
        return heliport;
    }

    public String getNomTuile() {
        return nomTuile;
    }

    public EtatTuile getEtat() {
        return this.etat;
    }

    //Constructeur--------------------------------------------------------
    Tuile(int idtuile, String nomTuile, EtatTuile etat) {
        this.idtuile = idtuile;
        this.nomTuile = nomTuile;
        this.etat = etat;
    }

    /**public void setInnondée() {
        this.etat = INONDEE;
    }

    public void setAssechee() {
        this.etat = ASSECHEE;
    }

    public void setCoulée() {
        this.etat = COULEE;
    }**/

    public void TuilesAdjacentes(Tuile tu) {

    }

    private final String[] nomTuilesTresor = {"Le temple de la lune", "Le temple du soleil", "Le jardin des murmures", "Le jardin des hurlements",
        "La caverne du brasier", "La caverne des ombres", "Le palais des marées", "Le palais de corail"};

    public String TresorTuile(Tuile tu) {
        if (tu.nomTuile == "Le temple de la lune" || tu.nomTuile == "Le temple du soleil") {
            return "La Pierre sacrée";// retourner l'objet trésor associé a la pierre ?
        } else if (tu.nomTuile == "Le jardin des murmures" || tu.nomTuile == "Le jardin des hurlements") {
            return "La Statue du zéphyr";
        } else if (tu.nomTuile == "La caverne du brasier" || tu.nomTuile == "La caverne des ombres") {
            return "Le Cristal ardent";
        } else if (tu.nomTuile == "Le palais des marées" || tu.nomTuile == "Le palais de corail") {
            return "Le Calice de l’onde";
        } else {
            return "Aucun trésor";
        }
    }

}
