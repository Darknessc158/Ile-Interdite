/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import static ileinterdite.Tuile.Etat.coulée;
import java.util.ArrayList;

/**
 *
 * @author amegliol
 */
public class Plongeur extends Aventurier {
    
    @Override
    public ArrayList<Tuile> getTuilesDispos() {
        TuilesDispos = getTuilesAdjacentes(idtuile);
        ArrayList<Tuile> TuilesDisponibles = new ArrayList<>();
        for (Tuile tuile : this.getTuilesDispos()) {
            if (tuile.getEtat().equals(coulée)) {
                //TuilesDispos.remove(tuile);
                //TuilesDisponibles = get
            }
        }
        return TuilesDispos;  
    }
}
