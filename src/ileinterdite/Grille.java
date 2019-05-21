/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Tuile.Element.nulll;
import static ileinterdite.Tuile.Etat.nullll;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author polydord
 */
public class Grille {

    //Declarations--------------------------------------------------------------
    public Tuile tuilenull = new Tuile(0, nullll, nulll, false);
    public Tuile grille[][] = new Tuile[6][6];
    ArrayList<Integer> temp = new ArrayList<>();
    int min = 1;
    int max = 24;
    int range = max - min + 1;
    int k;

    Grille(Tuile[][] grille) {
        this.grille = grille;
    }

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
        grille[0][0] = tuilenull;
        grille[0][1] = tuilenull;
        grille[0][4] = tuilenull;
        grille[0][5] = tuilenull;
        grille[1][0] = tuilenull;
        grille[1][5] = tuilenull;
        grille[4][0] = tuilenull;
        grille[4][5] = tuilenull;
        grille[5][0] = tuilenull;
        grille[5][1] = tuilenull;
        grille[5][4] = tuilenull;
        grille[5][5] = tuilenull;

        //Code de setGrille()---------------------------------------------------
        
        for (int i = 0; i < 6; i++) {                       // boucle avec conditions "non null" pour les lignes/colonnes
            for (int j = 0; j < 6; j++) {
                if (grille[i][j] != tuilenull) {                    // boucle pour parcourir le tableau
                        grille[i][j] = new Tuile(temp.get(k++),nullll, nulll, false); // ajout d'une case aléatoire à la grille
                    }
                }
            }  
        }

    public void afficheGrille() {
        for (int i = 0; i < 6; i++) {                       // boucle avec conditions "non null" pour les lignes/colonnes
            for (int j = 0; j < 6; j++) {
                System.out.println(grille[i][j].idtuile);
            }
        }
    }

    public void afficheTab() {
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));

        }
    }
}
