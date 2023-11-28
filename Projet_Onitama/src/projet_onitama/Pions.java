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
    boolean Sensei; 
    int position_ligne;
    int position_colonne; 
    boolean eleve;
    String couleur;  //R pour rouge et B pour

    public Pions(int position_ligne, int position_colonne, boolean eleve, int nb_eleve, int nb_maitre) {
        this.position_ligne = position_ligne;
        this.position_colonne = position_colonne;
        this.eleve = eleve;
  
    }

    public boolean get_eleve() {
        return eleve;
    }

    public int getPosition_ligne() {
        return position_ligne;
    }

    public int getPosition_colonne() {
        return position_colonne;
    }
   
    public boolean getSensei(){
        return Sensei; 
    }

}
