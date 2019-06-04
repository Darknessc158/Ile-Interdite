/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

//import static ileinterdite.Tuile.Etat.assechée;
import static IleInterdite.Utils.EtatTuile.ASSECHEE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;


public class Grille {

    //Declarations--------------------------------------------------------------
    public Tuile tuilenull = new Tuile(0, "NaN", null);
    public Tuile grille[][] = new Tuile[6][6];
    
 
    ArrayList<String> nomDesTuiles = new ArrayList<>();
    ArrayList<Tuile> TuilesTresor = new ArrayList<>();
    ArrayList<Tuile> TuilesValides = new ArrayList<>();
    
    
    
    private final String[] nomTuilesTresor = {"Le temple de la lune", "Le temple du soleil", "Le jardin des murmures", "Le jardin des hurlements",
                                     "La caverne du brasier", "La caverne des ombres", "Le palais des marées", "Le palais de corail"};

    Grille(Tuile[][] grille) {
        this.grille = grille;
    }

    //AJOUT DU NOM DE TOUTES LES TUILES A L'ARRAYLIST NOMDESTUILES
    public void setNomTuiles() {
        nomDesTuiles.add("Le pont des abimes");
        nomDesTuiles.add("La porte de bronze");             //SPAWN PION ROUGE
        nomDesTuiles.add("La caverne des ombres");
        nomDesTuiles.add("La porte de fer");                //SPAWN PION VIOLET
        nomDesTuiles.add("La porte d'or");                  //SPAWN PION JAUNE
        nomDesTuiles.add("Les falaises de l'oubli");
        nomDesTuiles.add("Le palais de corail");
        nomDesTuiles.add("La porte d'argent");               //SPAWN PION ORANGE
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
        nomDesTuiles.add("Le palais des marées");
        nomDesTuiles.add("Le val du crepuscule");
        nomDesTuiles.add("La tour de guet");
        nomDesTuiles.add("Le jardin des murmures");

    }
    //CREATION DE L'ARRAYLIST AVEC TOUTES LES TUILES SUR LEQUEL LE JOUEUR PEUX SE DEPLACER
    public void creerTuiles() {
        Tuile tuile;
        for (int i = 0; i <= 23; i++) {
            tuile = new Tuile(i, nomDesTuiles.get(i), ASSECHEE);
            TuilesValides.add(tuile);
            
            if (Arrays.asList(nomTuilesTresor).contains(nomDesTuiles.get(i))){
               TuilesTresor.add(tuile);
            }  
        }
        Collections.shuffle(TuilesValides);
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
        int k = 0;
        for (int i = 0; i < 6; i++) {                       // boucle avec conditions "non null" pour les lignes/colonnes
            for (int j = 0; j < 6; j++) {
                if (grille[i][j] != tuilenull) {                    // boucle pour parcourir le tableau
                    grille[i][j] = TuilesValides.get(k);
                    k++;
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
    
        
    
    // TEST POUR VERIFIER LA LISTE DES TUILES   A SUPPRIMER
    public void afficherTuilesTresor(){
            for (int i=0; i< TuilesTresor.size(); i++){
                System.out.println(TuilesTresor.get(i).getNomTuile());
            }
            }


}
