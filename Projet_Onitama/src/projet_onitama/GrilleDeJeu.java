/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

/**
 *
 * @author Gaspard Rouault
 */
public class GrilleDeJeu {
    CaseGrille[][] matriceCellules;
    int nbLignes;
    int nbColonnes;
    
    
    
    /**
     * Ce constructeur initialise nb lignes et colonnes et réserve la mémoire pour la grille de jeu et la cellule
     * @param nbLignes
     * @param nbColonnes
     */
    
    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = 5;
        this.nbColonnes = 5;
         
        matriceCellules=new CaseGrille[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Création d'un nouvel objet de type CelluleLumineuse pour chaque cellule
                this.matriceCellules[i][j] = new CaseGrille(false);
            }
        }
    }
    
    public boolean peutManger (int ligne, int colonne, Pions pion) {
        if (matriceCellules[ligne][colonne].estOccupee() == true) {
            if (matriceCellules[ligne][colonne].getPion_associe().getCouleur() != pion.getCouleur()) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    
    
    
}
