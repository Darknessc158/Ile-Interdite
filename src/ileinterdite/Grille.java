/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Tuile.Etat.assechée;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class Grille {

    //Declarations--------------------------------------------------------------
    public Tuile tuilenulle = new Tuile(0, "tuillenulle", null);
    public Tuile[][] GrilleDeTuiles = new Tuile[6][6];

    ArrayList<String> nomDesTuiles = new ArrayList<>();
    ArrayList<Tuile> TuilesTresor = new ArrayList<>();
    ArrayList<Tuile> TuilesValides = new ArrayList<>();
    //ArrayList<Tuile> TuilesSpawn = new ArrayList<>();  <-- PAS UTILISE ENCORE,

    private final String[] nomTuilesTresor = {"Le temple de la lune", "Le temple du soleil", "Le jardin des murmures", "Le jardin des hurlements",
        "La caverne du brasier", "La caverne des ombres", "Le palais des marées", "Le palais de corail"};

    Grille() {
        setGrille();
    }

    //AJOUT DU NOM DE TOUTES LES TUILES A L'ARRAYLIST NOMDESTUILES
    public void setNomTuiles() {
        nomDesTuiles.add("Le Pont des Abimes");
        nomDesTuiles.add("La Porte de Bronze"); //Pion.ROUGE
        nomDesTuiles.add("La Caverne des Ombres");
        nomDesTuiles.add("La Porte de Fer"); //Pion.VIOLET
        nomDesTuiles.add("La Porte d’Or"); //Pion.JAUNE
        nomDesTuiles.add("Les Falaises de l’Oubli");
        nomDesTuiles.add("Le Palais de Corail");
        nomDesTuiles.add("La Porte d’Argent"); //Pion.ORANGE
        nomDesTuiles.add("Les Dunes de l’Illusion");
        nomDesTuiles.add("Heliport");// Pion.BLEU 
        nomDesTuiles.add("La Porte de Cuivre");// Pion.VERT
        nomDesTuiles.add("Le Jardin des Hurlements");
        nomDesTuiles.add("La Foret Pourpre");
        nomDesTuiles.add("Le Lagon Perdu");
        nomDesTuiles.add("Le Marais Brumeux");
        nomDesTuiles.add("Observatoire");
        nomDesTuiles.add("Le Rocher Fantome");
        nomDesTuiles.add("La Caverne du Brasier");
        nomDesTuiles.add("Le Temple du Soleil");
        nomDesTuiles.add("Le Temple de La Lune");
        nomDesTuiles.add("Le Palais des Marees");
        nomDesTuiles.add("Le Val du Crepuscule");
        nomDesTuiles.add("La Tour du Guet");
        nomDesTuiles.add("Le Jardin des Murmures");

    }

    //CREATION DE L'ARRAYLIST AVEC TOUTES LES TUILES SUR LEQUEL LE JOUEUR PEUX SE DEPLACER
    public void creerTuiles() {
        Tuile tuile;
        for (int i = 0; i <= 23; i++) {
            tuile = new Tuile(i, nomDesTuiles.get(i), assechée);
            TuilesValides.add(tuile);

            if (Arrays.asList(nomTuilesTresor).contains(nomDesTuiles.get(i))) {
                TuilesTresor.add(tuile);
            }
        }
        // Collections.shuffle(TuilesValides);
    }

    public void setGrille() {
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
                    GrilleDeTuiles[i][j] = TuilesValides.get(k);
                    k++;
                }
            }
        }
    }

    public void afficheGrille2() {
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
        for (int i = 0; i < TuilesTresor.size(); i++) {
            System.out.println(TuilesTresor.get(i).getNomTuile());
        }
    }

    public Tuile[][] getGrilleDeTuiles() {
        return GrilleDeTuiles;
    }

    public ArrayList<Tuile> getTuilesValides() {
        return TuilesValides;
    }

}
