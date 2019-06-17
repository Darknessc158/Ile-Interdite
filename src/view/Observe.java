/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author amegliol
 */
public class Observe {
    private Observateur observateur;
    
    public void notifierObservateur(Message m){
        observateur.traiterMessage(m);
    }
    
    public void addObservateur(Observateur o){
        this.observateur = o;
    }
}
