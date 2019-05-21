/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

/**
 *
 * @author polydord
 */
public class Joueur {
    String nomJoueur;
    private int nbCartes;
    private int actionsRestantes;
    private int nbJoueurs;
   
    Joueur[] j = new Joueur[nbJoueurs];

    
    Joueur(String nomJoueur, int nbCartes,int actionsRestantes){
        this.nomJoueur = nomJoueur;
        this.nbCartes = nbCartes;
        this.actionsRestantes = actionsRestantes;
    }
    
    private void createJoueur(String nomjoueur){
        for(int i=1; i<= nbJoueurs; i++){
                j[i-1] = new Joueur (nomJoueur,0,3);            
        }
    }
    
    private void setNomJoueur(String nomJoueur){
        this.nomJoueur = nomJoueur;
    }
    private void resetActions(){
        this.actionsRestantes=0;
    }
}
