/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

/**
 *
 * @author marie
 */
public class Cartes {
    CaseGrille[][]matriceCellules;
    int nbLignes;
    int nbColonnes;
    public Cartes(CaseGrille[][] matriceCellules) {
        this.matriceCellules = matriceCellules;
    }
    
    public void Boar(){
        int mouv=0;
        switch (mouv){
        case 1:{
            //une case vers la droite
            for (int i=0; i<nbLignes; i++){
                for (int j=0; j<nbColonnes;j++){
                    //i+=1;
                    j+=1;
                }
            }
            break;
        }
        case 2:{
            //une case en haut
            for (int i=0; i<nbLignes; i++){
                for (int j=0; j<nbColonnes;j++){
                    i+=1;
                }
            }
        }
        case 3:{
            //une case à gauche
            for (int i=0; i<nbLignes; i++){
                for (int j=0; j<nbColonnes;j++){
                    j-=1;
                }
            }
            break;
        }
        
        }
    }
}
