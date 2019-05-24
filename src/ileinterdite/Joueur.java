/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import ileinterdite.Aventurier.Pion;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author polydord
 */
public class Joueur {
    String nomJoueur;
    private int nbCartes;
    private int actionsRestantes;

 

    
    Joueur(String nomJoueur, int nbCartes,int actionsRestantes, Aventurier aventurier){
        this.nomJoueur = nomJoueur;
        this.nbCartes = nbCartes;
        this.actionsRestantes = actionsRestantes;
    }
    

    
    private void setNomJoueur(String nomJoueur){
        this.nomJoueur = nomJoueur;
    }
    private void resetActions(){
        this.actionsRestantes=0;
    }
}
