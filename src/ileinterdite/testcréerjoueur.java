/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import java.util.Scanner;

/**
 *
 * @author polydord
 */
public class testcréerjoueur {

    public static void main(String[] args) {
        int nbJoueurs;
        Scanner entree = new Scanner(System.in);
        System.out.println("Nb joueurs ?");
        System.out.println("Saisir un entier :");
        nbJoueurs = entree.nextInt();
        if (nbJoueurs >2 || nbJoueurs < 4){
        Joueur[] j = new Joueur[nbJoueurs];
        }
        else {
            System.out.println("Le nombre de joueurs doit être compris entre 2 et 4");
        }
        for (int i = 1; i <= nbJoueurs; i++) {
            System.out.println("Saisir le nom du" + i + "eme joueur :");
            String nomJoueur = entree.next();
            j[i - 1] = new Joueur(nomJoueur, 0, 3);
        }
        for (int i = 1; i <= nbJoueurs; i++){
            System.out.println(j[i-1].nomJoueur);
        }
    }

}
