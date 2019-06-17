/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Tuile.Etat.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class Grille {

    //Declarations--------------------------------------------------------------
    private Tuile tuilenulle = new Tuile(0, "tuillenulle", null);
    private Tuile[][] GrilleDeTuiles = new Tuile[6][6];
    private ArrayList<String> nomDesTuiles;
    private ArrayList<String> nomDesTuilesTresor;
    public ArrayList<Tuile> tuilesTresor;
    public ArrayList<Tuile> tuilesValides;


    Grille() {
        tuilesTresor = new ArrayList<>();
        tuilesValides = new ArrayList<>();
        initGrille();
    }

    public Tuile getTuilenulle() {
        return tuilenulle;
    }

    public void setTuilenulle(Tuile tuilenulle) {
        this.tuilenulle = tuilenulle;
    }

    public ArrayList<String> getNomDesTuiles() {
        return nomDesTuiles;
    }

    public void setNomDesTuiles(ArrayList<String> nomDesTuiles) {
        this.nomDesTuiles = nomDesTuiles;
    }

    public ArrayList<Tuile> getTuilesTresor() {
        return tuilesTresor;
    }

    public void setTuilesTresor(ArrayList<Tuile> TuilesTresor) {
        this.tuilesTresor = TuilesTresor;
    }

    public ArrayList<String> getNomDesTuilesTresor() {
        return nomDesTuilesTresor;
    }

    public Tuile[][] getGrilleDeTuiles() {
        return GrilleDeTuiles;
    }

    public ArrayList<Tuile> getTuilesValides() {
        return tuilesValides;
    }

    public void setNomDesTuilesTresor(ArrayList<String> nomDesTuilesTresor) {
        this.nomDesTuilesTresor = nomDesTuilesTresor;
    }

    //AJOUT DU NOM DE TOUTES LES TUILES A L'ARRAYLIST NOMDESTUILES
    public void setNomTuiles() {
        nomDesTuilesTresor = new ArrayList<>();
        nomDesTuiles = new ArrayList<>();

        nomDesTuiles.add("La Porte de Bronze"); //Pion.ROUGE
        nomDesTuiles.add("La Porte d’Argent"); //Pion.ORANGE
        nomDesTuiles.add("La Porte de Fer"); //Pion.VIOLET
        nomDesTuiles.add("La Porte d’Or"); //Pion.JAUNE
        nomDesTuiles.add("Heliport");// Pion.BLEU 
        nomDesTuiles.add("La Porte de Cuivre");// Pion.VERT
        nomDesTuiles.add("Les Falaises de l’Oubli");
        nomDesTuiles.add("Les Dunes de l’Illusion");
        nomDesTuiles.add("Le Pont des Abimes");
        nomDesTuiles.add("La Foret Pourpre");
        nomDesTuiles.add("Le Lagon Perdu");
        nomDesTuiles.add("Le Marais Brumeux");
        nomDesTuiles.add("Observatoire");
        nomDesTuiles.add("Le Rocher Fantome");
        nomDesTuiles.add("Le Val du Crepuscule");
        nomDesTuiles.add("La Tour du Guet");
        nomDesTuiles.add("La Caverne des Ombres");nomDesTuilesTresor.add("La Caverne des Ombres");
        nomDesTuiles.add("Le Palais de Corail");nomDesTuilesTresor.add("Le Palais de Corail");
        nomDesTuiles.add("Le Jardin des Hurlements");nomDesTuilesTresor.add("Le Jardin des Hurlements");
        nomDesTuiles.add("Le Jardin des Murmures");nomDesTuilesTresor.add("Le Jardin des Murmures");
        nomDesTuiles.add("La Caverne du Brasier");nomDesTuilesTresor.add("La Caverne du Brasier");
        nomDesTuiles.add("Le Temple du Soleil");nomDesTuilesTresor.add("Le Temple du Soleil");
        nomDesTuiles.add("Le Temple de La Lune");nomDesTuilesTresor.add("Le Temple de La Lune");
        nomDesTuiles.add("Le Palais des Marees");nomDesTuilesTresor.add("Le Palais des Marees");

    }

    //CREATION DE L'ARRAYLIST AVEC TOUTES LES TUILES SUR LEQUEL LE JOUEUR PEUX SE DEPLACER
    public void creerTuiles() {
        Tuile tuile;
        int i = 0;
        for (String nomtuile : this.getNomDesTuiles()) {
            tuile = new Tuile(0, nomtuile, assechée);
            tuilesValides.add(tuile);
            if (getTuilesTresor().contains(nomtuile)) {
                tuilesTresor.add(tuile);
            }
        }
        Collections.shuffle(tuilesValides);
    }

    public void initGrille() {
        //Mettre null dans les cases non-jouables-------------------------------
        setNomTuiles();
        creerTuiles();
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

        int k = 0;
        for (int i = 0; i < 6; i++) {                       // boucle avec conditions "non null" pour les lignes/colonnes
            for (int j = 0; j < 6; j++) {
                if (GrilleDeTuiles[i][j] != tuilenulle) {                    // boucle pour parcourir le tableau
                    GrilleDeTuiles[i][j] = tuilesValides.get(k);
                    k++;
                }
            }
        }
    }

    public void afficherGrille() {
        for (int i = 0; i < 6; i++) {                       // boucle avec conditions "non null" pour les lignes/colonnes
            for (int j = 0; j < 6; j++) {
                if (GrilleDeTuiles[i][j] == tuilenulle) {
                    System.out.print("| X");
                } else if (GrilleDeTuiles[i][j].idtuile < 10) {
                    System.out.print("| " + GrilleDeTuiles[i][j].idtuile);
                } else {
                    System.out.print("|" + GrilleDeTuiles[i][j].idtuile);
                }
            }
            System.out.println("|");
        }
    }

    // TEST POUR VERIFIER LA LISTE DES TUILES   A SUPPRIMER
    public void afficherTuilesTresor() {
        for (int i = 0; i < tuilesTresor.size(); i++) {
            System.out.println(tuilesTresor.get(i).getNomTuile());
        }
    }

}
