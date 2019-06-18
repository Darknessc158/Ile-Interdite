/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import java.util.ArrayList;


public class Joueur {
    
    private String nomJoueur;
    private int actionsRestantes;
    private Aventurier aventurier;
    private ArrayList<Carte> CarteJoueur;

    
    Joueur(String nomJoueur,int actionsRestantes, Aventurier aventurier){
        this.nomJoueur = nomJoueur;
        this.actionsRestantes = actionsRestantes;
        this.aventurier = aventurier;
        CarteJoueur = new ArrayList<>();
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public ArrayList<Carte> getCarteJoueur() {
        return CarteJoueur;
    }

    
    
    public int getActionsRestantes() {
        return actionsRestantes;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }


    public void setActionsRestantes(int actionsRestantes) {
        this.actionsRestantes = actionsRestantes;
    }
    
  

}
