/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import java.util.ArrayList;

public class Tresor {

    private String nomTresor;
    private ArrayList<Tresor> lesTresors;

    Tresor() {
        initTresor();
    }

    Tresor(String nomTresor) {
        this.nomTresor = nomTresor;
    }

    public String getNomTresor() {
        return nomTresor;
    }

    public ArrayList<Tresor> getLesTresors() {
        return lesTresors;
    }

    public void initTresor() {
        
        lesTresors = new ArrayList<>();
        
        Tresor t1 = new Tresor("Le Cristal ardent");
        lesTresors.add(t1);
        Tresor t2 = new Tresor("La Pierre sacrée");
        lesTresors.add(t2);
        Tresor t3 = new Tresor("La Statue du zéphyr");
        lesTresors.add(t3);
        Tresor t4 = new Tresor("Le Calice de l’onde");
        lesTresors.add(t4);
    }

}
