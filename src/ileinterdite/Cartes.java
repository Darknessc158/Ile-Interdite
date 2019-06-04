/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;


public abstract class Cartes {
    
    
    private String nomCarte;
    
    Cartes(String nomCarte){
        this.nomCarte = nomCarte;
    }

    public void setNomCarte(String nomCarte) {
        this.nomCarte = nomCarte;// PAS DE SETTER ICI , NOM DES CARTES A DEFINIR POUR CHAQUE SOUS CLASSE
    }
    
    
}
