/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author amegliol
 */
public class PileRecuperable {

    private ArrayList<Carte> pileRecuperable;

    PileRecuperable() {
        initPileRecuperable();
    }

    public ArrayList<Carte> getPileRecuperable() {
        return pileRecuperable;
    }
    
    public void initPileRecuperable() {
        pileRecuperable = new ArrayList<>();

        for (int j = 0; j < 5; j++) {
            Carte carte = new Carte("Le Cristal ardent");
            pileRecuperable.add(carte);
        }
        for (int j = 0; j < 5; j++) {
            Carte carte = new Carte("La Pierre sacrée");
            pileRecuperable.add(carte);
        }
        for (int j = 0; j < 5; j++) {
            Carte carte = new Carte("La Statue du zéphyr");
            pileRecuperable.add(carte);
        }
        for (int j = 0; j < 5; j++) {
            Carte carte = new Carte("Le Calice de l’onde");
            pileRecuperable.add(carte);
        }
        for (int j = 0; j < 3; j++) {
            Carte carte = new Carte("Montée des eaux");
            pileRecuperable.add(carte);
        }
        for (int j = 0; j < 2; j++) {
            Carte carte = new Carte("Sac de sable");
            pileRecuperable.add(carte);
        }
        for (int j = 0; j < 3; j++) {
            Carte carte = new Carte("Helicoptere");
            pileRecuperable.add(carte);
        }
        
        Collections.shuffle(pileRecuperable);
    }
    
    public void afficherPile(){
        for (Carte carte : this.getPileRecuperable()){
            System.out.println(carte.getNomCarte());
        }
    }

}
