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
public class Controleur implements Observateur {

    private int niveauEau;
    private Grille grille;
    private IHM ihm;
    private ArrayList<Aventurier> LesAventuriers = new ArrayList<>();
    private int actionRestantes;
    
    
    
    //LISTE DES TRESORS DISPONIBLE ET CEUX RECUPERES PAR L'EQUIPE
        private Tresor tresor;
        private ArrayList<Tresor> TresorsDisponibles;
        private ArrayList<Tresor> TresorsRecuperes;
    //PILE ET DEFAUSSE DES CARTES INONDATION (qui sont en fait des tuiles)
        private ArrayList<Tuile> PileInondation;
        private ArrayList<Tuile> DefausseInondation;
    //PILE ET DEFAUSSE DES CARTES RECUPERABLES (carte tresor) -- Instancier pileREcuperable()
        private PileRecuperable pileR;    //Création d'un objet de type PileRecuperable qui initialise la pile
        private ArrayList<Carte> PileRecuperable;
        private ArrayList<Carte> DefausseRecuperable;

    Controleur() {
        grille = new Grille();
        ihm = new IHM();
        ihm.addObservateur(this);
        //grille.afficherGrille();    // JUSTE POUR TESTER GRILLE 
        grille.afficheGrille2();
        ihm.initialisationBoutons();
        ihm.appelleMap();
        ihm.afficher();     
        
    }

    public void setNiveauEau(int niveauEau) {
        this.niveauEau = niveauEau;
    }

    public ArrayList<Tuile> getPileInondation() {
        return PileInondation;
    }

    public ArrayList<Tuile> getDefausseInondation() {
        return DefausseInondation;
    }

    public Grille getGrille() {
        return grille;
    }

    public ArrayList<Aventurier> getLesAventuriers() {
        return LesAventuriers;
    }

    public void initAventurier() {
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
    
    
    
    public void initPileDefausseInondation(){
        PileInondation = new ArrayList<>();
        DefausseInondation = new ArrayList<>();
        
        PileInondation = grille.getLesTuiles();
    }
    
    public void initPileDefausseRecuperable(){
        pileR = new PileRecuperable();
        PileRecuperable = pileR.getPileRecuperable();
        DefausseRecuperable = new ArrayList<>();        
            }
    
    public void initTresors(){
        tresor = new Tresor();  //LE CONSTRUCTEUR DE TRESOR() FABRIQUE 4 OBJETS DE TYPE TRESOR(STRING NOMTRESOR)
        TresorsDisponibles =  tresor.getLesTresors();   //ON RECUPERE LA LISTE DES 4 TRESORS
        TresorsRecuperes = new ArrayList<>();   //AUCUN TRESOR N'A ETE RECUPERER POUR L'INSTANT
    }
    
    public void RecupererTresor(Tresor tresor){
        TresorsDisponibles.remove(tresor);
        TresorsRecuperes.add(tresor);
    }
        
    public void MonteeDesEaux(){
        setNiveauEau(niveauEau + 1);       //A MODIFIER SI UN PARAMETRE EST RENTRE (a verifier)
        
        //Gestion de Pile et Defausse Inondation
        Collections.shuffle(DefausseInondation);
        for (Tuile tuile : getDefausseInondation()){
            getPileInondation().add(tuile);
            getDefausseInondation().remove(tuile);
        }
        
        //IL FAUT AUSSI DEFAUSSER LA CARTE MONTEE DES EAUX DE LA PILE CARTE RECUPERABLES
        
    }

    
    @Override
    public void traiterMessage(Message m) {

        switch (m.typeMessage) {
            case INITIALISATION_MAP:
                this.ihm.initialisationMap(this.getGrille().getGrilleDeTuiles());

                break;
            case ASSECHER:
                this.ihm.afficheAssechables(this.getGrille().getGrilleDeTuiles(), 5);

                //méthode pour afficher les cases asséchables
                break;
            case DEPLACER:

                //méthode pour afficher la case sur laquelle le joueur peux aller
                //méthode pour actualiser la case avec le joueur
                break;
            case FIN_TOUR:
                //méthode pour terminer le tour actuel
                //commencer tour du joueur suivant
                break;
        }
    }

    public static void main(String[] args) {

        Controleur appli = new Controleur();
       appli.pileR.afficherPile();

    }

}

//

