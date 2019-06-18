/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Tuile.Etat.*;
import static ileinterdite.Tuile.Event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class Grille {

    //Declarations--------------------------------------------------------------
    private Tuile tuilenulle = new Tuile(0, "tuillenulle", null, null);
    private Tuile[][] GrilleDeTuiles = new Tuile[6][6];
    private ArrayList<Tuile> LesTuiles;

    Grille() {
        initGrille();
    }

    public Tuile getTuilenulle() {
        return tuilenulle;
    }
    
    public ArrayList<Tuile> getLesTuiles() {
        return LesTuiles;
    }

    public Tuile[][] getGrilleDeTuiles() {
        return GrilleDeTuiles;
    }

    public void initTuiles() {

        LesTuiles = new ArrayList<>();

        Tuile t1 = new Tuile(1, "La Porte de Bronze", assechée, SPAWN_ROUGE);
        LesTuiles.add(t1);
        Tuile t2 = new Tuile(2, "La Porte d’Argent", assechée, SPAWN_ORANGE);
        LesTuiles.add(t2);
        Tuile t3 = new Tuile(3, "La Portee de Fer", assechée, SPAWN_VIOLET);
        LesTuiles.add(t3);
        Tuile t4 = new Tuile(4, "La Porte d’Or", assechée, SPAWN_JAUNE);
        LesTuiles.add(t4);
        Tuile t5 = new Tuile(5, "Heliport", assechée, SPAWN_BLEU);
        LesTuiles.add(t5);
        Tuile t6 = new Tuile(6, "La Porte de Cuivre", assechée, SPAWN_VERT);
        LesTuiles.add(t6);
        Tuile t7 = new Tuile(7, "Les Falaises de l’Oubli", assechée, null);
        LesTuiles.add(t7);
        Tuile t8 = new Tuile(8, "Les Dunes de l’Illusion", assechée, null);
        LesTuiles.add(t8);
        Tuile t9 = new Tuile(9, "Le Pont des Abimes", assechée, null);
        LesTuiles.add(t9);
        Tuile t10 = new Tuile(10, "La Foret Pourpre", assechée, null);
        LesTuiles.add(t10);
        Tuile t11 = new Tuile(11, "Le Lagon Perdu", assechée, null);
        LesTuiles.add(t11);
        Tuile t12 = new Tuile(12, "Le Marais Brumeux", assechée, null);
        LesTuiles.add(t12);
        Tuile t13 = new Tuile(13, "Observatoire", assechée, null);
        LesTuiles.add(t13);
        Tuile t14 = new Tuile(14, "Le Rocher Fantome", assechée, null);
        LesTuiles.add(t14);
        Tuile t15 = new Tuile(15, "Le Val du Crepuscule", assechée, null);
        LesTuiles.add(t15);
        Tuile t16 = new Tuile(16, "La Tour du Guet", assechée, null);
        LesTuiles.add(t16);
        Tuile t17 = new Tuile(17, "La Caverne des Ombres", assechée, TRESOR_CRISTAL);
        LesTuiles.add(t17);
        Tuile t18 = new Tuile(18, "La Caverne du Brasier", assechée, TRESOR_CRISTAL);
        LesTuiles.add(t18);
        Tuile t19 = new Tuile(19, "Le Palais de Corail", assechée, TRESOR_CALICE);
        LesTuiles.add(t19);
        Tuile t20 = new Tuile(20, "Le Palais des Marees", assechée, TRESOR_CALICE);
        LesTuiles.add(t20);
        Tuile t21 = new Tuile(21, "Le Temple de La Lune", assechée, TRESOR_PIERRE);
        LesTuiles.add(t21);
        Tuile t22 = new Tuile(22, "Le Temple du Soleil", assechée, TRESOR_PIERRE);
        LesTuiles.add(t22);
        Tuile t23 = new Tuile(23, "Le Jardin des Hurlements", assechée, TRESOR_ZEPHYR);
        LesTuiles.add(t23);
        Tuile t24 = new Tuile(24, "Le Jardin des Murmures", assechée, TRESOR_ZEPHYR);
        LesTuiles.add(t24);

        Collections.shuffle(LesTuiles);
    }

    public void initGrille() {
        initTuiles();
        GrilleDeTuiles[0][0] = tuilenulle;
        GrilleDeTuiles[0][1] = tuilenulle;
        GrilleDeTuiles[0][4] = tuilenulle;
        GrilleDeTuiles[0][5] = tuilenulle;
        GrilleDeTuiles[1][0] = tuilenulle;
        GrilleDeTuiles[1][5] = tuilenulle;
        GrilleDeTuiles[4][0] = tuilenulle;
        GrilleDeTuiles[4][5] = tuilenulle;
        GrilleDeTuiles[5][0] = tuilenulle;
        GrilleDeTuiles[5][1] = tuilenulle;
        GrilleDeTuiles[5][4] = tuilenulle;
        GrilleDeTuiles[5][5] = tuilenulle;

        int t = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (getGrilleDeTuiles()[i][j] != tuilenulle) {
                    getGrilleDeTuiles()[i][j] = getLesTuiles().get(t);
                    t++;
                }
            }
        }
    }

    public void afficheGrille2() {
        for (int i = 0; i < 6; i++) {                       // boucle avec conditions "non null" pour les lignes/colonnes
            for (int j = 0; j < 6; j++) {
                if (GrilleDeTuiles[i][j] == null) {
                    System.out.print("| X");
                } else if (GrilleDeTuiles[i][j].getIdtuile() < 10) {
                    System.out.print("| " + GrilleDeTuiles[i][j].getIdtuile());
                } else {
                    System.out.print("|" + GrilleDeTuiles[i][j].getIdtuile());
                }
            }
            System.out.println("|");
        }
    }

}
