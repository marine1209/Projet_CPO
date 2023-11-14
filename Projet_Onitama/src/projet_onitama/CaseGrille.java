/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

/**
 *
 * @author nicol
 */
public class CaseGrille {
 
    boolean etat;
    int longueur;
    int largeur;

    
    public CaseGrille(boolean etat, int longueur, int largeur) {
        this.etat = false;
        this.longueur = 60;
        this.largeur = 60;
    }
    
    
    /**
     * true signifie que la case est occupée et false qu'elle est libre
     * Cette méthode permet de modifier cet état pour une case donnée
     */
    public void activerCase() {
        if (etat == false) {
            etat = true;
        } else {
            etat = false;
        }
    }
    
    
}
