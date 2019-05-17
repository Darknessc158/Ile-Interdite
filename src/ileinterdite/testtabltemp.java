/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import java.util.ArrayList;

/**
 *
 * @author polydord
 */
public class testtabltemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<>();
    int min = 1;
    int max = 24;
    int range = max - min +1;
        for (int i = 1; i < 25; i++) { 
            int rand = (int)(Math.random() * range) + min;
            if(temp.contains(rand) == false ){
            temp.add(rand);
            }
            else{
                i--;
            }
        } 
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));
            
        }
        System.out.println("il y a " + temp.size() + "cases");

    }
    
}
