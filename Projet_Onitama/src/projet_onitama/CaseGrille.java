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
    
    private boolean etat;
    private Pions pion_associe;

    public CaseGrille(boolean etat) {
        this.etat = false;
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
    
    
    
    
    
}
