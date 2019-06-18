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

public class IHM extends Observe {

    private final JFrame fenetre;
    private JPanel mainPanel;
    private JPanel grillePanel;
    private JPanel panelBoutons;
    private Aventurier a;
    private JButton[][] grillebouton;
    private JPanel panelAventurier;

    public IHM() {
        fenetre = new JFrame();
 
        mainPanel = new JPanel(new BorderLayout());
        panelBoutons = new JPanel(new GridLayout(5, 0));
        panelAventurier = new JPanel(new GridLayout(0, 5));
        grillePanel = new JPanel(new GridLayout(6, 6));

        mainPanel.add(grillePanel, BorderLayout.CENTER);
        mainPanel.add(panelBoutons, BorderLayout.EAST);
        mainPanel.add(panelAventurier, BorderLayout.WEST);
        fenetre.add(mainPanel);

    }
    
    public void afficher(){
        fenetre.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(800, 800);
        fenetre.setVisible(true);
    }

    public JButton[][] getGrillebouton() {
        return grillebouton;
    }

    public JPanel getGrillePanel() {
        return grillePanel;
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
                    getGrillebouton()[i][j] = new JButton();
                    getGrillebouton()[i][j].setBackground(Color.cyan);

                    getGrillebouton()[i][j].setEnabled(false);
                } else {
                    getGrillebouton()[i][j] = new JButton(t.getNomTuile());
                    getGrillebouton()[i][j].setForeground(Color.WHITE);
                    if (i == 0 & j == 3) {
                        getGrillebouton()[i][j].setBackground(Color.RED);
                    } else if (i == 1 & j == 3){
                    getGrillebouton()[i][j].setBackground(Color.YELLOW);
                    
                    }else if (i == 2 & j == 3){
                    getGrillebouton()[i][j].setBackground(Color.BLUE);
                    
                    }else if (i == 1 & j == 2){
                    getGrillebouton()[i][j].setBackground(Color.BLACK);
                    
                    }else if (i == 2 & j == 4){
                    getGrillebouton()[i][j].setBackground(Color.GREEN);
                    
                    }else if (i == 2 & j == 1){
                    getGrillebouton()[i][j].setBackground(Color.ORANGE);
                    
                    }else {
                        getGrillebouton()[i][j].setBackground(Color.DARK_GRAY);
                    }

                }
                this.getGrillePanel().add(this.getGrillebouton()[i][j]);
            }
        }
    }

    public void afficheAssechables(Tuile[][] tuiles, int idtuile) {
        Tuile t;

        ArrayList temp = new ArrayList<>();
        temp = a.getTuilesAssechables();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                t = tuiles[i][j];
                if (temp.contains(t.getIdtuile())) {
                    grillebouton[i][j].setBackground(Color.LIGHT_GRAY);
                } else {
                    grillebouton[i][j].setEnabled(false);
                }
            }
        }
    }

}
