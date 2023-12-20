/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

/**
 *
 * @author marin
 */
public class Pions {
    
    CaseGrille [][] matriceCellules;
    private int position_ligne;
    private int position_colonne; 
    private boolean eleve;
    private boolean Mort;
    private String couleur;  //R pour rouge et B pour bleu

    public Pions(int position_ligne, int position_colonne, boolean eleve, String couleur) {
        this.position_ligne = position_ligne;
        this.position_colonne = position_colonne;
        this.eleve = eleve;
        this.Mort= false;
        this.couleur=couleur;
  
    }

    public int getPosition_ligne() {
        return position_ligne;
    }

    public int getPosition_colonne() {
        return position_colonne;
    }

    public boolean estEleve() {
        return eleve;
    }

    public String getCouleur() {
        return couleur;
    }
    
    //CREER LA METHODE POUR CHECKER QU'UNE CASE VOULUE EST BIEN DANS LA GRILLE
    /*public boolean verifierCaseDansGrille(int position_ligne, int position_colonne, Cartes carte) {
        String animal = carte.nom;
        
    }*/
    
    
    
    public boolean verif_position(int ligne, int colonne){
        if (ligne>4 || colonne>4 || ligne<0 || colonne<0){
            return false;
        }
        else
            return true;
    }
    
    public void changement_coord (int ligne, int colonne){
        if (verif_position(ligne, colonne)==true){
            this.position_colonne=colonne;
            this.position_ligne=ligne;
        }   
    }
    
    public void MortDuPion(){
        this.Mort=true;
    }
    
    public boolean VerifierSiPeutSeDeplacer (Pions pion, int ligne_visee, int colonne_visee) {
        if (verif_position(ligne_visee, colonne_visee) == true) {
            if (matriceCellules[ligne_visee][colonne_visee].pion_associe == null) {
                return true;
            } else if(matriceCellules[ligne_visee][colonne_visee].pion_associe != null) {
                if (matriceCellules[ligne_visee][colonne_visee].pion_associe.getCouleur() != pion.getCouleur()) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

}
    
