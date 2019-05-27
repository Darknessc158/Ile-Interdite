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
import java.util.Collections;

/**
 *
 * @author polydord
 */
public class Grille {

    //Declarations--------------------------------------------------------------
    public Tuile tuilenull = new Tuile(0, "NaN", nullll, nulll, false);
    public Tuile grille[][] = new Tuile[6][6];
    ArrayList<String> nomDesTuiles = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();
    int min = 1;
    int max = 24;
    int range = max - min + 1;
    int k;
    int p;
    int idtuileRouge;
    int idtuileHeliport;
    int idtuileViolet;
    int idtuileJaune;
    int idtuileVert;
    int idtuileOrange;

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

    public void setNomTuiles() {
        nomDesTuiles.add("Le pont des abimes");
        nomDesTuiles.add("La porte de bronze");             //SPAWN PION ROUGE
        nomDesTuiles.add("La caverne des ombres");
        nomDesTuiles.add("La porte de fer");                //SPAWN PION VIOLET
        nomDesTuiles.add("La porte d'or");                  //SPAWN PION JAUNE
        nomDesTuiles.add("Les falaises de l'oubli");
        nomDesTuiles.add("Le palais de corail");
        nomDesTuiles.add("La porte d'argent");//SPAWN PION ORANGE
        nomDesTuiles.add("Les dunes de l'illusion");
        nomDesTuiles.add("Heliport");                       //SPAWN PION BLEU
        nomDesTuiles.add("La porte de cuivre");             //SPAWN PION VERT
        nomDesTuiles.add("Le jardin des hurlements");
        nomDesTuiles.add("La foret pourpre");
        nomDesTuiles.add("Le lagon perdu");
        nomDesTuiles.add("Le marais brumeux");
        nomDesTuiles.add("Observatoire");
        nomDesTuiles.add("Le rocher fantome");
        nomDesTuiles.add("La caverne du brasier");
        nomDesTuiles.add("Le temple du soleil");
        nomDesTuiles.add("Le temple de la lune");
        nomDesTuiles.add("Le palais des maress");
        nomDesTuiles.add("Le val du crepuscule");
        nomDesTuiles.add("La tour de guet");
        nomDesTuiles.add("Le jardin des murmures");

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
                    grille[i][j] = new Tuile(temp.get(k++), nomDesTuiles.get(p++), nullll, nulll, false);
                    if (nomDesTuiles.get(p) == "La porte de bronze") {
                        idtuileRouge = temp.get(k);
                    } else if (nomDesTuiles.get(p) == "Heliport") {
                        idtuileHeliport = temp.get(k);
                    } else if (nomDesTuiles.get(p) == "La porte de fer") {
                        idtuileViolet = temp.get(k);
                    } else if (nomDesTuiles.get(p) == "La porte de cuivre") {
                        idtuileVert = temp.get(k);
                    } else if (nomDesTuiles.get(p) == "La porte d'argent") {
                        idtuileOrange = temp.get(k);
                    } else if (nomDesTuiles.get(p) == "La porte d'or") {
                        idtuileJaune = temp.get(k);
                    }
                }
            }
        }
    }

    
    public int getidtuileRouge() {
        return idtuileRouge;
    }

    public int getidtuileVert() {
        return idtuileVert;
    }

    public int getidtuileViolet() {
        return idtuileViolet;
    }

    public int getidtuileJaune() {
        return idtuileJaune;
    }

    public int getidtuileOrange() {
        return idtuileOrange;
    }

    public int getidtuileHeliport() {
        return idtuileHeliport;
    }

    public void afficheGrille() {
        for (int i = 0; i < 6; i++) {                       // boucle avec conditions "non null" pour les lignes/colonnes
            for (int j = 0; j < 6; j++) {
                if (grille[i][j] != tuilenull) {
                    System.out.println(grille[i][j].nomTuile + " = tuile numero : " + grille[i][j].idtuile);
                }
            }
        }
    }

    public void afficheGrille2() {
        for (int i = 0; i < 6; i++) {                       // boucle avec conditions "non null" pour les lignes/colonnes
            for (int j = 0; j < 6; j++) {
                if (grille[i][j] == tuilenull) {
                    System.out.print("| X");
                } else if (grille[i][j].idtuile < 10) {
                    System.out.print("| " + grille[i][j].idtuile);
                } else {
                    System.out.print("|" + grille[i][j].idtuile);
                }
            }
            System.out.println("|");
        }
    }

    public void afficheTab() {
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));

        }
    }
}
