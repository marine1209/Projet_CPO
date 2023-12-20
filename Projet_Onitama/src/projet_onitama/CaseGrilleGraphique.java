/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author nicol
 */
public class CaseGrilleGraphique extends JButton {
    
    CaseGrille caseGrilleAssociee;
    boolean etat;
    Pions pion_associe;
    
    public CaseGrilleGraphique(boolean etat, Pions pion_associe) {
        this.etat = etat;
        this.pion_associe = pion_associe;
    }
    public CaseGrilleGraphique(boolean etat) {
        this.etat = etat;
        this.pion_associe = null; // Pas de pion associé dans ce cas
    }
    
    /**
     * Passe l'etat de la case de false à true et inversement
     */
    public void activerCase() {
        if (etat == false) {
            etat = true;
        } else {
            etat = false;
        }
    }
    
    /**
     * Renvoie true si la case est occupée, false si elle est inoccupée.
     * @return
     */
    public boolean estOccupee() {
        if (etat == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getEtat() {
        return etat;
    }

    public Pions getPion_associe() {
        return pion_associe;
    }
    
    
    
    
    

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
                    if (pion.estEleve() == true) {
                        g.setColor(Color.red);
                        g.fillOval(2, 2, longueur - 4, hauteur-4);
                    } else {
                        g.setColor(Color.red); // Par exemple, utiliser la couleur bleue
                        g.fillRect(2, 2, longueur - 4, hauteur - 4);
                    }
                } else if ("bleu".equals(pion.getCouleur())) {
                    if (pion.estEleve() == true) {
                        g.setColor(Color.blue);
                        g.fillOval(2, 2, longueur - 4, hauteur-4);
                    } else {
                        g.setColor(Color.blue); // Par exemple, utiliser la couleur bleue
                        g.fillRect(2, 2, longueur - 4, hauteur - 4);
                    }
                }
            }
        } else {
            g.setColor(Color.gray);
            g.fillOval(2, 2, longueur - 4, hauteur - 4);
        }
    }
    public Pions onClick() {
        Pions pionSelectionne=caseGrilleAssociee.getPion_associe();
        return pionSelectionne;
    }
    public void mettreEnEvidence(ArrayList<ArrayList<Integer>> CoordonneePossible){
        Graphics g = getGraphics();
        for (int i = 0; i<CoordonneePossible.size(); i++){
            int ligne = CoordonneePossible.get(i).get(0); 
            int colonne = CoordonneePossible.get(i).get(1); 
            g.setColor(Color.green);
        g.drawRect(colonne * getWidth() / 5, ligne * getHeight() / 5, getWidth() /5, getHeight() / 5);
        }
         
            
           
        
    }

}




    
    
    
