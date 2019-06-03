/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Tuile.Etat.assechée;
import static ileinterdite.Tuile.Etat.coulée;
import static ileinterdite.Tuile.Etat.innondé;
import java.util.ArrayList;


/**
 *
 * @author polydord
 */
public class Tuile {

    
    public int idtuile;
    public Etat etat;
    //public Element element;
    public boolean heliport;
    public String nomTuile;
    private ArrayList<Tuile> TuilesTresor;

    
    //Initialisation Types Enumérés----------------------------------------
    public enum Element {
        feu, eau, herbe, sable
    };

    public enum Etat {
        assechée, innondé, coulée
    };

    public int getIdtuile() {
        return idtuile;
    }

    //public Element getElement() {
    //    return element;
    //}

    public boolean isHeliport() {
        return heliport;
    }

    public String getNomTuile() {
        return nomTuile;
    }
       
    public Etat getEtat(){
        return this.etat;
    }

    //Constructeurs--------------------------------------------------------
    Tuile(int idtuile,String nomTuile, Etat etat) {
        this.idtuile = idtuile;
        this.nomTuile= nomTuile;
        this.etat = etat;
        //this.element = element;
        //this.heliport = heliport;
       
    }
    
    public void setInnondée(){
    this.etat = innondé;
    }
    
    public void setAssechee(){
        this.etat = assechée;
    }
    
    public void setCoulée(){
        this.etat = coulée;
    }
 
    public void TuilesAdjacentes(Tuile tu) {
        
    }
    
    public void TresorTuile(Tuile tu){
        if (tu.nomTuile == "Le temple de la lune" || tu.nomTuile == "Le temple du soleil"){
            return 
        } 
    }
    
    
    
}
