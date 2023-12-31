/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class CaseGrille {
    
    boolean etat;
    Pions pion_associe;
    
    /**
     * Constructeur de CaseGrille avec un pion associe
     * @param etat
     * @param pion_associe
     */
    public CaseGrille(boolean etat, Pions pion_associe) {
        this.etat = etat;
        this.pion_associe = pion_associe;
    }

    /**
     * Constructeur de la classe CaseGrille sans pion associé.
     * @param etat
     */
    public CaseGrille(boolean etat) {
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

    /**
     * Récupère l'état de la case.
     * @return
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Récupère le pion associé à la case.
     * @return
     */
    public Pions getPion_associe() {
        return pion_associe;
    }
    
    /**
     * Met en évidence les cellules de la grille aux coordonnées spécifiées en les entourant d'un carré vert.
     * @param CoordonneePossible
     */
    public void mettreEnEvidence(ArrayList<ArrayList<Integer>> CoordonneePossible){
        Graphics g = getGraphics();
        for (int i = 0; i<CoordonneePossible.size(); i++){
            int ligne = CoordonneePossible.get(i).get(0); 
            int colonne = CoordonneePossible.get(i).get(1); 
            g.setColor(Color.green);
        g.drawRect(colonne * getWidth() / 5, ligne * getHeight() / 5, getWidth() /5, getHeight() / 5);
        } 
    
    
    
}

    private Graphics getGraphics() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getWidth() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
