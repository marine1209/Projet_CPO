/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

/**
 *
 * @author nicol
 */
public class GrilledeJeu {
    
    CaseGrille[][] matriceCases;

    public GrilledeJeu() {
        matriceCases = new CaseGrille[5][5];
        for (int i = 0 ; i<5 ; i++) {
            for (int j = 0 ; j<5 ; j++) {
                matriceCases[i][j] = new CaseGrille(true, 1, 1);
            }
        }
        
    }
    
    
    
    
}
