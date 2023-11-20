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
    int dimension=5;
    
    
    /**
     * Ce constructeur initialise nb lignes et colonnes et réserve la mémoire pour la grille de jeu et la cellule
     * @param nbLignes
     * @param nbColonnes
     */
    
    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        
        matriceCellules=new CaseGrille[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                // Création d'un nouvel objet de type CelluleLumineuse pour chaque cellule
                this.matriceCellules[i][j] = new CaseGrille();
            }
        }
    }
}
