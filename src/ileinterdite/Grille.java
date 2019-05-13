/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

/**
 *
 * @author polydord
 */
public class Grille {
    private Tuile grille[][] = new Tuile [6][6];
    
    public void setGrille(){
       
       //------------------------------------------------------------------------- 
       grille[1][1] = null;
       grille[1][2] = null;
       grille[1][5] = null;
       grille[1][6] = null;
       grille[2][1] = null;
       grille[2][6] = null;
       grille[5][1] = null;
       grille[5][6] = null;
       grille[6][1] = null;
       grille[6][2] = null;
       grille[6][5] = null;
       grille[6][6] = null;     //Mettre la valeur null dans les cases des angles
       //-------------------------------------------------------------------------
       
       for (i)                    // boucle avec conditions "non null" pour les lignes/colonnes
    }
    
}
