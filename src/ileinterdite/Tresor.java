/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

public class Tresor {

    private final String[] nomTresor = {"Le Cristal ardent", "La Pierre sacrée", "La Statue du zéphyr", "Le Calice de l’onde"};
    private int i;
    private boolean dispo;

    //Constructeur
    Tresor(String nomTresor, boolean dispo) {
        this.nomTresor[i] = nomTresor;
        this.dispo = dispo;
    }

    public String[] getNomTresor() {
        return nomTresor;
    }

    public boolean estDisponible() {
        return dispo;
    }

    private void CreerTresor() {
        Tresor tresor;
        for (i = 0; i < 4; i++) {
            tresor = new Tresor(nomTresor[i], true);
        }

    }
}
