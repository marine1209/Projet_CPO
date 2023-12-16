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
        if (caseGrilleAssociee.estOccupee()) {
    Pions pion = caseGrilleAssociee.getPion_associe();
    if (pion != null) {
        if ("rouge".equals(pion.getCouleur())) {
            g.setColor(Color.red);
            g.fillOval(2, 2, longueur - 4, hauteur-4);
        } else if ("bleu".equals(pion.getCouleur())) {
            g.setColor(Color.blue);
            g.fillOval(2, 2, longueur - 4, hauteur-4);
        }
    }
} else {
    g.setColor(Color.gray);
    g.fillOval(2, 2, longueur - 4, hauteur - 4);
}
    
    }
}




    
    
    
