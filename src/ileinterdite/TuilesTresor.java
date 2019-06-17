/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

/**
 *
 * @author amegliol
 */
public class TuilesTresor extends Tuile{

    private Tresor tresor;
    
    public TuilesTresor(int idtuile, String nomTuile, Etat etat,Tresor tresor) {
        super(idtuile, nomTuile, etat);
        this.tresor = tresor;
    }
    
    
    

}
