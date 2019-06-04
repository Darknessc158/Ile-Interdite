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
 * @author polydord
 */
public class Controlleur {

    private int nbJoueurs;
    private String nomJoueur;
    Joueur[] j = new Joueur[nbJoueurs];
    Aventurier[] a = new Aventurier[nbJoueurs];
       ArrayList<Tresor> LesTresorsRécupérés = new ArrayList<>();
    ArrayList<Tresor> LesTresors = new ArrayList<>();
    
    
    
    /**public void createJoueur(String nomjoueur) {
        Collections.shuffle(couleurs);
        for (int i = 1; i <= nbJoueurs; i++) {
            a[i - 1] = new Aventurier(couleurs.get(i), 0);
            j[i - 1] = new Joueur(nomJoueur, 0, 3, a[i - 1]);
        }
    }**/

    public static void main(String[] args) {

        Controlleur controlleur = new Controlleur();

        Tuile grille[][] = new Tuile[6][6];
        Grille g = new Grille(grille);
        int nbJoueurs;
        //Initialisation de la grille-----------------------------------------------
       // g.setTableauTemp();
        System.out.println("On affiche le tableau");
        System.out.println("------------------------------------");
        //g.afficheTab();
        System.out.println("------------------------------------");
        System.out.println("On affiche la grille");
        System.out.println("------------------------------------");
        g.setNomTuiles();
                g.creerTuiles();
        g.setGrille();
        g.afficheGrille2();
        System.out.println("------------------------------------");

        g.afficherTuilesTresor();
        
        /**Scanner entree = new Scanner(System.in);
        System.out.println("Nb joueurs ?");
        System.out.println("Saisir un entier :");
        nbJoueurs = entree.nextInt();
        

        
        for (int i = 1; i <= nbJoueurs; i++) {
            System.out.println("Saisir le nom du" + i + "eme joueur :");
            String nomJoueur = entree.next();
            controlleur.createJoueur(nomJoueur);**/
          

        }

    }


//

