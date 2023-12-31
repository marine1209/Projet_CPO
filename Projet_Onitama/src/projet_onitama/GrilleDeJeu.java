 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

import java.util.ArrayList;

/**
 *
 * @author Gaspard Rouault
 */
public class GrilleDeJeu {
    CaseGrille[][] matriceCellules;
    
    
    
    
    
    /**
     * Ce constructeur initialise nb lignes et colonnes et réserve la mémoire pour la grille de jeu et la cellule
   
     */
    
    public GrilleDeJeu() {
      
        matriceCellules=new CaseGrille[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Création d'un nouvel objet de type CelluleLumineuse pour chaque cellule
              if (i==0 && j==2){  
                this.matriceCellules[i][j] = new CaseGrille(true, new Pions (i, j, false, "rouge"));
                
              }else
              if (0==i && j!=2){
                this.matriceCellules[i][j] = new CaseGrille(true, new Pions (i, j, true, "rouge"));
                   
              }else
              if (i==4 && j==2){  
                this.matriceCellules[i][j] = new CaseGrille(true, new Pions (i, j, false, "bleu"));
                 
              }else
              if (i==4 && j!=2){
                this.matriceCellules[i][j] = new CaseGrille(true,  new Pions (i, j, true, "bleu"));
                 
              }
              else{
                  this.matriceCellules[i][j] = new CaseGrille(false);
              }
              
              
              
    }   

}
}

    /**
     * Méthode qui Vérifie si un pion peut manger un pion adverse en fonction des coordonnées spécifiées.
     * @param ligneAdversaire
     * @param colonneAdversaire
     * @param ligneAttaquant
     * @param colonneAttaquant
     * @return
     */
    public boolean peuxManger (int ligneAdversaire, int colonneAdversaire, int ligneAttaquant, int colonneAttaquant){
        if (matriceCellules[ligneAdversaire][colonneAdversaire].estOccupee()==false){
            return false;
        }
        if (matriceCellules[ligneAdversaire][colonneAdversaire].getPion_associe().getCouleur()!= matriceCellules[ligneAttaquant][colonneAttaquant].getPion_associe().getCouleur()){
            if (matriceCellules[ligneAdversaire][colonneAdversaire].getPion_associe().estEleve()==false){
               matriceCellules[ligneAdversaire][colonneAdversaire].getPion_associe().MortDuPion();
            } 
            return true;
        }
        else {
            return false;
        }
    }
    

}

