/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;


public class Joueur {
    String nomJoueur;
    private int nbCartes;
    private int actionsRestantes;
    private Aventurier aventurier;

    
    Joueur(String nomJoueur, int nbCartes,int actionsRestantes, Aventurier aventurier){
        this.nomJoueur = nomJoueur;
        this.nbCartes = nbCartes;
        this.actionsRestantes = actionsRestantes;
        this.aventurier = aventurier;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public int getNbCartes() {
        return nbCartes;
    }

    public int getActionsRestantes() {
        return actionsRestantes;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public void setNbCartes(int nbCartes) {
        this.nbCartes = nbCartes;
    }

    public void setActionsRestantes(int actionsRestantes) {
        this.actionsRestantes = actionsRestantes;
    }
    
  

}
