/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Aventurier.Pion.rouge;

/**
 *
 * @author polydord
 */
public class Aventurier {
    

    public enum Pion {
        rouge, bleu, vert, orange, jaune, violet
    };
    private Pion couleurPion;
    private int idtuile;

    Aventurier(Pion couleurPion, int idtuile) {
        this.idtuile = idtuile;
        this.couleurPion = couleurPion;
    }

    public Pion getCouleur() {
        return this.couleurPion;
    }

}