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
    private String nomJoueur;
    private int nbCartes;
    private int actionsRestantes;
    private int nbJoueurs;
    
    Joueur(String nomJoueur, int nbCartes,int actionsRestantes){
        this.nomJoueur = nomJoueur;
        this.nbCartes = nbCartes;
        this.actionsRestantes = actionsRestantes;
    }
    
    private void createJoueurs(int nbJoueurs){
        for (int i = 1; i < nbJoueurs; i++){
            Joueur joueur = new Joueur("joueur"+i, 0, 3);
            
        }
    }
}
