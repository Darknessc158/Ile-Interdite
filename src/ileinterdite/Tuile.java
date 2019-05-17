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
public class Tuile {

    //Initialisation Types Enumérés----------------------------------------
    public enum Element {
        feu, eau, herbe, sable, nul
    };

    public enum Etat {
        sec, innondé, coulé
    };
    //Declarations---------------------------------------------------------
    public int idtuile;
    private Etat etat;
    private Element element;
    private boolean heliport;

    //Constructeurs--------------------------------------------------------
    Tuile(int idtuile, Etat etat, Element element, boolean heliport) {
        this.idtuile = idtuile;
        this.etat = etat;
        this.element = element;
        this.heliport = heliport;
    }

}
