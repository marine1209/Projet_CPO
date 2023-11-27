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
    int position_ligne;
    int position_colonne; 
    boolean eleve;
    String couleur;  //R pour rouge et B pour bleu

    public Pions(int position_ligne, int position_colonne, boolean eleve) {
        this.position_ligne = position_ligne;
        this.position_colonne = position_colonne;
        this.eleve = eleve;
    }
    
    
}
