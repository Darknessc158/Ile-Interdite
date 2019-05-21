/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import java.util.ArrayList;

/**
 *
 * @author polydord
 */
public class Controlleur {

    public static void main(String[] args) {
        Tuile grille[][] = new Tuile[6][6];
        Grille g = new Grille(grille);
        //Initialisation de la grille-----------------------------------------------
        g.setTableauTemp();
        System.out.println("On affiche le tableau");
        System.out.println("------------------------------------");
        g.afficheTab();
        System.out.println("------------------------------------");
        System.out.println("On affiche la grille");
        System.out.println("------------------------------------");
        g.setGrille();
        g.afficheGrille();
        System.out.println("------------------------------------");

    }
    //
}
