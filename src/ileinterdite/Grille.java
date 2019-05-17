/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import java.util.ArrayList;

/**
 *
 * @author polydord
 */
public class Grille {

    //Declarations--------------------------------------------------------------
    private Tuile grille[][] = new Tuile[6][6];
    ArrayList<Integer> temp = new ArrayList<>();
    int min = 1;
    int max = 24;
    int range = max - min + 1;

    //Generation vecteur d'entiers tous differents------------------------------
    public void setTableauTemp() {
        for (int i = 1; i < 25; i++) {
            int rand = (int) (Math.random() * range) + min;
            if (temp.contains(rand) == false) {
                temp.add(rand);
            } else {
                i--;
            }
        }
    }

    public void setGrille() {

        //Mettre null dans les cases non-jouables-------------------------------
        grille[1][1] = null;
        grille[1][2] = null;
        grille[1][5] = null;
        grille[1][6] = null;
        grille[2][1] = null;
        grille[2][6] = null;
        grille[5][1] = null;
        grille[5][6] = null;
        grille[6][1] = null;
        grille[6][2] = null;
        grille[6][5] = null;
        grille[6][6] = null;

        //Code de setGrille()---------------------------------------------------
        for (int i = 1; i < 6; i++) {                       // boucle avec conditions "non null" pour les lignes/colonnes
            for (int j = 1; j < 6; j++) {
                if (grille[i][j] != null) {                 //si la tuile est différente de null 
                    for (int k = 1; k < temp.size(); k++) { // boucle pour parcourir le tableau
                        grille[i][j].idtuile = temp.get(k); // ajout d'une case aléatoire à la grille
                    }
                }
            }
        }
    }
}
