/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Aventurier.Pion.getFromName;
import static ileinterdite.Tuile.Etat.coulée;
import static ileinterdite.Tuile.Etat.innondé;
import java.awt.Color;
import java.util.ArrayList;

public class Aventurier {

    private int idtuile;
    Grille grille;
    private String nomTuile;
    public ArrayList<Tuile> TuilesAjdacentes;
    public ArrayList<Tuile> TuilesAssechables;
    public ArrayList<Tuile> TuilesDispos;
    private Pion CouleurPion;

    public static enum Pion {
        ROUGE("Rouge", new Color(255, 0, 0)),
        VERT("Vert", new Color(0, 195, 0)),
        BLEU("Bleu", new Color(55, 194, 198)),
        ORANGE("Orange", new Color(255, 148, 0)),
        VIOLET("Violet", new Color(204, 94, 255)),
        JAUNE("Jaune", new Color(255, 255, 0));

        private String libelle;
        private Color couleur;

        Pion(String libelle, Color couleur) {
            this.libelle = libelle;
            this.couleur = couleur;
        }

        @Override
        public String toString() {
            return this.libelle;
        }

        public Color getCouleur() {
            return this.couleur;
        }

        static Pion getFromName(String name) {
            if (ROUGE.name().equals(name)) {
                return ROUGE;
            }
            if (VERT.name().equals(name)) {
                return VERT;
            }
            if (BLEU.name().equals(name)) {
                return BLEU;
            }
            if (ORANGE.name().equals(name)) {
                return ORANGE;
            }
            if (VIOLET.name().equals(name)) {
                return VIOLET;
            }
            if (JAUNE.name().equals(name)) {
                return JAUNE;
            }
            return null;
        }
    }

    Aventurier(String couleur, int idtuile) {
        this.idtuile = idtuile;
        this.CouleurPion = getFromName(couleur);
    }

    public Pion getCouleurPion() {
        return CouleurPion;
    }

    public int getIdtuile() {
        return idtuile;
    }

        public ArrayList<Tuile> getTuilesAdjacentes(int idtuile) {
        ArrayList<Tuile> TuilesAdjacentes = new ArrayList<>();
        int j = getPosition(grille, idtuile)[0];
        int i = getPosition(grille, idtuile)[1];

        if (j != 0) {        //On vérifie si la tuile du dessus existe
            j = j - 1;        //On se place sur la tuile au dessus

            if (grille.getGrilleDeTuiles()[i][j].getNomTuile() != "tuilenulle") {
                TuilesAdjacentes.add(grille.getGrilleDeTuiles()[i][j]);
            }
        }
        j = getPosition(grille, idtuile)[0];
        if (j != 5) {        //On vérifie si la tuile du dessous existe
            j = j + 1;        //On se place sur la tuile au dessous

            if (grille.getGrilleDeTuiles()[i][j].getNomTuile() != "tuilenulle") {
                TuilesAdjacentes.add(grille.getGrilleDeTuiles()[i][j]);
            }
        }
        j = getPosition(grille, idtuile)[0];
        if (i != 0) {
            i = i - 1;//on se place sur la tuile de gauche
            if (grille.getGrilleDeTuiles()[i][j].getNomTuile() != "tuilenulle") {
                TuilesAdjacentes.add(grille.getGrilleDeTuiles()[i][j]);
            }
        }
        i = getPosition(grille, idtuile)[1];
        if (i != 5) {
            i = i + 1;    //on se place sur la tuile de droite        
            if (grille.getGrilleDeTuiles()[i][j].getNomTuile() != "tuilenulle") {
                TuilesAdjacentes.add(grille.getGrilleDeTuiles()[i][j]);
            }
        }
        return TuilesAdjacentes;
    }
    
    public ArrayList<Tuile> getTuilesAssechables() {
        TuilesAssechables = getTuilesAdjacentes(idtuile);
        for (Tuile tuile : this.getTuilesAssechables()) {
            if (tuile.getEtat().equals(innondé)) {
                TuilesAssechables.remove(tuile);
            }
        }
        return TuilesAssechables;
    }

    public ArrayList<Tuile> getTuilesDispos() {
            TuilesDispos = getTuilesAdjacentes(idtuile);
        for (Tuile tuile : this.getTuilesDispos()) {
            if (tuile.getEtat().equals(coulée)) {
                TuilesDispos.remove(tuile);
            }
        }
        return TuilesDispos;             
    }
    
        public int[] getPosition(Grille grille, int idtuile) {
        int[] position = new int[2];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (grille.getGrilleDeTuiles()[i][j].getIdtuile() == idtuile) {
                    position[0] = j;
                    position[1] = i;
                    break;
                }
            }
        }
        return position;
    }

    public void setTuilesAssechables(ArrayList<Tuile> TuilesAssechables) {
        this.TuilesAssechables = TuilesAssechables;
    }

    public void setTuilesDispo(ArrayList<Tuile> TuilesDispo) {
        this.TuilesDispos = TuilesDispo;
    }

    public void deplacerAventurier(Aventurier aventurier) {
        
    }

}
