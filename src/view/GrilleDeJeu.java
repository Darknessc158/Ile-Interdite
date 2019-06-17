/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import ileinterdite.Aventurier;
import ileinterdite.Grille;
import ileinterdite.Tuile;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import static view.TypeMessage.*;

public class GrilleDeJeu extends Observe {

    private final JFrame window;
    private JPanel mainPanel;
    private JPanel grillePanel;
    private JPanel panelBoutons;
    private Aventurier a;
    private JButton[][] grillebouton;
    private JPanel panelAventurier;

    public GrilleDeJeu() {
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        //Définit taille de la fenetre en pixels
        window.setSize(800, 800);

        mainPanel = new JPanel(new BorderLayout());
        panelBoutons = new JPanel(new GridLayout(5, 0));
        panelAventurier = new JPanel(new GridLayout(0, 5));
        grillePanel = new JPanel(new GridLayout(6, 6));

        window.setVisible(true);

        mainPanel.add(grillePanel, BorderLayout.CENTER);
        mainPanel.add(panelBoutons, BorderLayout.EAST);
        mainPanel.add(panelAventurier, BorderLayout.WEST);
        window.add(mainPanel);

    }

    public void initialisationVueAventurier() {

        JToggleButton vueP1 = new JToggleButton();
        panelAventurier.add(vueP1);
        vueP1.setBackground(Color.cyan);
        vueP1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Message m = new Message();
                m.typeMessage = ASSECHER;
                notifierObservateur(m);
            }
        });
        
         JToggleButton vueP2 = new JToggleButton();
        panelAventurier.add(vueP2);
        vueP2.setBackground(Color.RED);
        vueP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Message m = new Message();
                m.typeMessage = ASSECHER;
                notifierObservateur(m);
            }
        });
        
         JToggleButton vueP3 = new JToggleButton();
        panelAventurier.add(vueP3);
        vueP3.setBackground(Color.cyan);
        vueP3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Message m = new Message();
                m.typeMessage = ASSECHER;
                notifierObservateur(m);
            }
        });
        
         JToggleButton vueP4 = new JToggleButton();
        panelAventurier.add(vueP4);
        vueP4.setBackground(Color.cyan);
        vueP4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Message m = new Message();
                m.typeMessage = ASSECHER;
                notifierObservateur(m);
            }
        });
    }

    public void initialisationBoutons() {
        JButton btnAssecher = new JButton("Assécher");
        panelBoutons.add(btnAssecher);
        btnAssecher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Message m = new Message();
                m.typeMessage = ASSECHER;
                notifierObservateur(m);
            }
        });

        JButton btnDeplacement = new JButton("Déplacement");
        panelBoutons.add(btnDeplacement);
        btnDeplacement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Message m = new Message();
                m.typeMessage = DEPLACER;
                notifierObservateur(m);
            }
        });

        JButton btnDonnerCarte = new JButton("Donner une carte");
        panelBoutons.add(btnDonnerCarte);
        btnDonnerCarte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Message m = new Message();
                m.typeMessage = DONNER_CARTE;
                notifierObservateur(m);
            }
        });

        JButton btnFinTour = new JButton("Fin tour");
        panelBoutons.add(btnFinTour);
        btnFinTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Message m = new Message();
                m.typeMessage = FIN_TOUR;
                notifierObservateur(m);
            }
        });
    }

    public void appelleMap() {
        Message m = new Message();
        m.typeMessage = TypeMessage.INITIALISATION_MAP;
        notifierObservateur(m);
    }

    public void initialisationMap(Tuile[][] tuiles) {
        Tuile t;
        grillebouton = new JButton[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                t = tuiles[i][j];
                if (t.getNomTuile().equalsIgnoreCase("tuillenulle")) {
                    grillebouton[i][j] = new JButton();
                    grillebouton[i][j].setBackground(Color.cyan);

                    grillebouton[i][j].setEnabled(false);
                } else {
                    grillebouton[i][j] = new JButton(t.getNomTuile());
                    grillebouton[i][j].setForeground(Color.WHITE);
                    if (i == 0 & j == 3) {
                        grillebouton[i][j].setBackground(Color.RED);
                    } else if (i == 1 & j == 3){
                    grillebouton[i][j].setBackground(Color.YELLOW);
                    
                    }else if (i == 2 & j == 3){
                    grillebouton[i][j].setBackground(Color.BLUE);
                    
                    }else if (i == 1 & j == 2){
                    grillebouton[i][j].setBackground(Color.BLACK);
                    
                    }else if (i == 2 & j == 4){
                    grillebouton[i][j].setBackground(Color.GREEN);
                    
                    }else if (i == 2 & j == 1){
                    grillebouton[i][j].setBackground(Color.ORANGE);
                    
                    }else {
                        grillebouton[i][j].setBackground(Color.DARK_GRAY);
                    }

                }
                this.grillePanel.add(grillebouton[i][j]);
            }
        }
    }

    public void afficheAssechables(Tuile[][] tuiles, int idtuile) {
        Tuile t;

        ArrayList temp = new ArrayList<>();
        temp = a.TuilesAssechables(idtuile);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                t = tuiles[i][j];
                if (temp.contains(t.idtuile)) {
                    grillebouton[i][j].setBackground(Color.LIGHT_GRAY);
                } else {
                    grillebouton[i][j].setEnabled(false);
                }
            }
        }
    }

}
