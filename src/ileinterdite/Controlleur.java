/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import ileinterdite.Aventurier.Pion;
import static ileinterdite.Aventurier.Pion.rouge;
import static ileinterdite.Aventurier.Pion.vert;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author polydord
 */
public class Controlleur {

    private int nbJoueurs;
    private String nomJoueur;
    Joueur[] j = new Joueur[nbJoueurs];
    Aventurier[] a = new Aventurier[nbJoueurs];
    ArrayList<Pion> couleurs = new ArrayList<>();

    public void createJoueur(String nomjoueur) {
        Collections.shuffle(couleurs);
        for (int i = 1; i <= nbJoueurs; i++) {
            a[i - 1] = new Aventurier(couleurs.get(i), 0);
            j[i - 1] = new Joueur(nomJoueur, 0, 3, a[i - 1]);
        }
    }

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

        Scanner entree = new Scanner(System.in);
        System.out.println("Nb joueurs ?");
        System.out.println("Saisir un entier :");
        nbJoueurs = entree.nextInt();
        

        
        for (int i = 1; i <= nbJoueurs; i++) {
            System.out.println("Saisir le nom du" + i + "eme joueur :");
            String nomJoueur = entree.next();
            controlleur.createJoueur(nomJoueur);
          

            /*System.out.println("Quelle couleur de pion ?");
            String couleurJoueur = entree.next();
            if (couleurJoueur == "Rouge"){
                Aventurier AventurierRouge = new Aventurier(rouge,g.getidtuileRouge());
            }
            else if (couleurJoueur =="Vert"){
                Aventurier AventurierVert = new Aventurier(vert,g.getidtuileVert());
            }
            else if (couleurJoueur =="Orange"){
                Aventurier AventurierOrange = new Aventurier(vert,g.getidtuileOrange());
            }
            else if (couleurJoueur =="Bleu"){
                Aventurier AventurierBleu = new Aventurier(vert,g.getidtuileHeliport());
            }
            else if (couleurJoueur =="Violet"){
                Aventurier AventurierViolet = new Aventurier(vert,g.getidtuileViolet());
            }             
            else if (couleurJou)*/
        }
        /*for (int i = 1; i <= nbJoueurs; i++) {
            System.out.println(j[i - 1].nomJoueur);
        }*/
    }

}

//

