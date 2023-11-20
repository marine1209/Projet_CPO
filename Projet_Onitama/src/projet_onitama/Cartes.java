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
    int mouv=0;
    
    int i;
    int j;
    public Cartes(CaseGrille[][] matriceCellules) {
        this.matriceCellules = matriceCellules;
        
    }
    public void mouv_droite(int position_Ccase){
        matriceCellules[i][position_Ccase]=matriceCellules[i][position_Ccase+1];               
    }
    
    public void mouv_gauche(int position_Ccase){
        matriceCellules[i][position_Ccase]=matriceCellules[i][position_Ccase-1];       
    }
    
    public void mouv_haut(int position_Lcase){
        matriceCellules[position_Lcase][j]=matriceCellules[position_Lcase+1][j];
    }
    
    public void mouv_bas(int position_Lcase){
        matriceCellules[position_Lcase][j]=matriceCellules[position_Lcase-1][j];
    }
    
    public void mouv_diag_HDroite(int position_Ccase,int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase+1][position_Ccase+1];
    }
    
    public void mouv_diag_HGauche(int position_Ccase,int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase+1][position_Ccase-1];
    }
    
    public void mouv_diag_BGauche(int position_Ccase,int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase-1][position_Ccase-1];
    }
    
    public void mouv_diag_BDroite(int position_Ccase,int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase-1][position_Ccase+1];
    }
    public void Boar(){
        
        switch (mouv){
        case 1:
            this.mouv_droite(position_Ccase);
            break;
        
        case 2:
            //une case en haut
            this.mouv_haut();
            break;
        
        case 3:
            this.mouv_gauche();
            break;
        
        
        }
    }
    
    public void Cobra(){
        switch(mouv){
            case 1:
                this.mouv_gauche();
                break;
            case 2:
                this.mouv_diag_HDroite();
                break;
            case 3:
                this.mouv_diag_BDroite();
        }
    }
    
    
}
