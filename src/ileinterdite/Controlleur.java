/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import view.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author polydord
 */
public class Controlleur implements Observateur {

    private int niveauEau;
    private Grille grille = new Grille();
    //private final String[] couleur = {"Rouge", "Vert", "Bleu", "Orange", "Jaune", "Violet"};
    private GrilleDeJeu ihm;
    private ArrayList<Aventurier> LesAventuriers = new ArrayList<>();

    Controlleur(GrilleDeJeu ihm) {
        this.ihm = ihm;
        ihm.addObservateur(this);
    }
    
    public void TourDeJeu(){
        
    }
    
    
    public void InitAventurier() {
        Tuile tuile;
        Aventurier Ingénieur = new Aventurier("Rouge", 0);
        LesAventuriers.add(Ingénieur);

        Aventurier Plongeur = new Aventurier("Violet", 1);
        LesAventuriers.add(Plongeur);

        Aventurier Messager = new Aventurier("Jaune", 2);
        LesAventuriers.add(Messager);

        Aventurier Navigateur = new Aventurier("Orange", 3);
        LesAventuriers.add(Navigateur);

        Aventurier Pilote = new Aventurier("Bleu", 4);
        LesAventuriers.add(Pilote);

        Aventurier Explorateur = new Aventurier("Vert", 5);
        LesAventuriers.add(Explorateur);

        Collections.shuffle(LesAventuriers);
    }

    public void CréerJoueurs() {
        Scanner sc = new Scanner(System.in);
        int nbjoueurs = 0;

        while (!(nbjoueurs < 5 && nbjoueurs > 1)) {
            System.out.println("Nombre de joueurs ? (de 2 à 4 joueurs) : ");
            nbjoueurs = sc.nextInt();

            for (int i = 0; i < nbjoueurs; i++) {
                System.out.print("/n Nom du joueur n°" + i + " : ");
                String nomjoueur = sc.nextLine();

                Joueur joueur;
                joueur = new Joueur(nomjoueur, 0, 0, LesAventuriers.get(i));
            }
            System.out.println("Enregistrement des joueurs terminés !");
        }

    }

    public Grille getGrille() {
        return grille;
    }

    public static void main(String[] args) {

        GrilleDeJeu ihm = new GrilleDeJeu();
        Controlleur appli = new Controlleur(ihm);
        appli.getGrille().afficheGrille2();
        ihm.initialisationBoutons();
        ihm.appelleMap();

    }

    @Override
    public void traiterMessage(Message m) {
        switch (m.typeMessage) {
            case INITIALISATION_MAP:
                this.ihm.initialisationMap(this.getGrille().GrilleDeTuiles);
                break;
            case ASSECHER:
                this.ihm.afficheAssechables(this.getGrille().GrilleDeTuiles, 5);
                //méthode pour afficher les cases asséchables
                break;
            case DEPLACER:
                //méthode pour afficher la case sur laquelle le joueur peux aller
                //méthode pour actualiser la case avec le joueur
                break;
            case FIN_TOUR:
                //méthode pour terminer le tour actuel
                //commender tour du joueur suivant
                break;
        }
    }

}

//

