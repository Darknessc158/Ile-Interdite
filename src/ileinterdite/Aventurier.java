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
public class Aventurier {
    public enum Pion { rouge, bleu, vert, orange, jaune, violet};
    private Pion couleurPion;
    
    public Pion getCouleur(){
        return this.couleurPion;
    }
    
    
}
