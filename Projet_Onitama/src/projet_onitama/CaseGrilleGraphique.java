/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author nicol
 */
public class CaseGrilleGraphique extends JButton {
    
    CaseGrille caseGrilleAssociee;
    Pions pion;
    
    
    /*public String quiOccupeLaCase() {
        
    }//*/

    public CaseGrilleGraphique(CaseGrille caseGrilleAssociee) {
        this.caseGrilleAssociee = caseGrilleAssociee;
    }
    
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int longueur = this.getWidth();
        int hauteur = this.getHeight();
        if (caseGrilleAssociee.estOccupee() == false) {
            g.setColor(Color.gray);
        } else {
            if (pion.getCouleur() == "R") {
                if (pion.estEleve() == true) {
                    g.setColor(Color.red);
                    g.fillOval(0, 0, 40, 40);
                } else {
                    g.setColor(Color.red);
                    g.fillRect(0, 0, 40, 40);
                }
            } else if (pion.getCouleur() == "B") {
                if (pion.estEleve() == true) {
                    g.setColor(Color.blue);
                    g.fillOval(0, 0, 40, 40);
                } else {
                    g.setColor(Color.blue);
                    g.fillRect(0, 0, 40, 40);
                }
            }
        }
        g.fillOval(2, 2, longueur - 4, hauteur - 4);
        
        
        int w = this.getWidth();
        int h = this.getHeight();
        if (caseGrilleAssociee.estOccupee() == true) {
        g.setColor(Color.red);
        } else {
        g.setColor(Color.blue);
        }
        g.fillOval(2, 2, w - 4, h - 4);
 }

    } 
    
    
