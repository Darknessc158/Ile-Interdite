/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Tuile.Etat.assechée;
import static ileinterdite.Tuile.Etat.coulée;
import static ileinterdite.Tuile.Etat.innondé;


/**
 *
 * @author polydord
 */
public class Tuile {


    //Initialisation Types Enumérés----------------------------------------
    public enum Element {
        feu, eau, herbe, sable, nulll
    };

    public enum Etat {
        assechée, innondé, coulée, nullll
    };
    //Declarations---------------------------------------------------------
    public int idtuile;
    public Etat etat;
    public Element element;
    public boolean heliport;

    //Constructeurs--------------------------------------------------------
    Tuile(int idtuile, Etat etat, Element element, boolean heliport) {
        this.idtuile = idtuile;
        this.etat = etat;
        this.element = element;
        this.heliport = heliport;
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
    public Etat getEtat(){
        return this.etat;
    }
    
    

}
