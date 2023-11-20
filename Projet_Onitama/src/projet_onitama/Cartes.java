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
    int position_Ccase;
    int position_Lcase;
    int i;
    int j;
    public Cartes(CaseGrille[][] matriceCellules) {
        this.matriceCellules = matriceCellules;
        this.position_Ccase=position_Ccase;
        this.position_Lcase=position_Lcase;
        
    }
    public void mouv_droite(int position_Ccase, int m){
        matriceCellules[i][position_Ccase]=matriceCellules[i][position_Ccase+m];               
    }
    
    public void mouv_gauche(int position_Ccase, int n){
        matriceCellules[i][position_Ccase]=matriceCellules[i][position_Ccase-n];       
    }
    
    public void mouv_haut(int position_Lcase, int c){
        matriceCellules[position_Lcase][j]=matriceCellules[position_Lcase+c][j];
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
    
    public void mouv_droite_particulier(int position_Ccase, int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase+1][position_Ccase+2];
    }
    
    public void mouv_gauche_particulier(int position_Ccase, int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase+1][position_Ccase-2];
    }
    public void Boar(){
        
        switch (mouv){
        case 1:
            this.mouv_droite(position_Ccase,1);
            break;
        
        case 2:
            //une case en haut
            this.mouv_haut(position_Lcase,1);
            break;
        
        case 3:
            this.mouv_gauche(position_Ccase,1);
            break;
        
        
        }
    }
    
    public void Cobra(){
        switch(mouv){
            case 1:
                this.mouv_gauche(position_Ccase,1);
                break;
            case 2:
                this.mouv_diag_HDroite(position_Ccase,position_Lcase);
                break;
            case 3:
                this.mouv_diag_BDroite(position_Ccase,position_Lcase);
        }
    }
    
    public void Crab(){
        switch(mouv){
            case 1:
                this.mouv_haut(position_Lcase,1);
                break;
            case 2:
                this.mouv_droite(position_Ccase,2);
                break;
            case 3:
                this.mouv_gauche(position_Ccase,2);
                break;
        }
    }
    
    public  void Crane(){
        switch(mouv){
            case 1:
                this.mouv_haut(position_Lcase,1);
                break;
            case 2:
                this.mouv_diag_BDroite(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_diag_BGauche(position_Ccase, position_Lcase);
                break;
        }
    }
    
    public void Dragon(){
        switch (mouv){
            case 1:
                this.mouv_diag_BDroite(position_Ccase,position_Lcase);
                break;
            case 2:
                this.mouv_diag_BGauche(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_droite_particulier(position_Ccase,position_Lcase);
                break;
            case 4:
                this.mouv_gauche_particulier(position_Ccase,position_Lcase);
                break;
        }
    }
    
    public void Eel(){
        switch (mouv){
            case 1:
                this.mouv_droite(position_Ccase, 1);
                break;
            case 2:
                this.mouv_diag_BGauche(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_diag_HGauche(position_Ccase, position_Lcase);
                break;
        }
    }
    
    public void Elephant(){
        switch (mouv){
            case 1:
                this.mouv_diag_HDroite(position_Ccase, position_Lcase);
                break;
            case 2:
                this.mouv_diag_HGauche(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_droite(position_Ccase, 1);
                break;
            case 4:
                this.mouv_gauche(position_Ccase,1);
                break;
        }
    }
    
    public void Frog(){
        switch(mouv){
            case 1:
                this.mouv_gauche(position_Ccase,2);
                break;
            case 2:
                this.mouv_diag_HGauche(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_diag_BDroite(position_Ccase, position_Lcase);
                break;
        }
    }
    
    public void Goose(){
        switch(mouv){
            case 1:
                this.mouv_gauche(position_Ccase,1);
                break;
            case 2:
                this.mouv_droite(position_Ccase,1);
                break;
            case 3:
                this.mouv_diag_HGauche(position_Ccase, position_Lcase);
                break;
            case 4:
                this.mouv_diag_BDroite(position_Ccase, position_Lcase);
                break;
        }
    }
    
    public void Horse(){
        switch(mouv){
            case 1:
                this.mouv_bas(position_Lcase);
                break;
            case 2:
                this.mouv_haut(position_Lcase,1);
                break;
            case 3:
                this.mouv_gauche(position_Ccase, 1);
        }
    }
    
    public void Mantis(){
        switch(mouv){
            case 1:
                this.mouv_diag_HDroite(position_Ccase,position_Lcase);
                break;
            case 2:
                this.mouv_diag_HGauche(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_bas(position_Lcase);
                break;
        }
    }
    
    public void Monkey(){
        switch (mouv){
            case 1:
                this.mouv_diag_HDroite(position_Ccase,position_Lcase);
                break;
            case 2:
                this.mouv_diag_HGauche(position_Ccase,position_Lcase);
                break;
            case 3:
                this.mouv_diag_BDroite(position_Ccase,position_Lcase);
                break;
            case 4:
                this.mouv_diag_BGauche(position_Ccase,position_Lcase);
                break;
        }
    }
    
    public void Ox(){
        switch (mouv){
            case 1:
                this.mouv_bas(position_Lcase);
                break;
            case 2:
                this.mouv_haut(position_Lcase,1);
                break;
            case 3:
                this.mouv_droite(position_Ccase, 1);
                break;
        }
    }
    
    public void Rabbit(){
        switch (mouv){
            case 1:
                this.mouv_diag_HDroite(position_Ccase, position_Lcase);
                break;
            case 2:
                this.mouv_diag_BGauche(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_droite(position_Ccase, 2);
                break;
        }
    }
    
    public void Rooster(){
        switch (mouv){
            case 1:
                this.mouv_droite(position_Ccase, 1);
                break;
            case 2:
                this.mouv_gauche(position_Ccase, 1);
                break;
            case 3:
                this.mouv_diag_HDroite(position_Ccase,position_Lcase);
                break;
            case 4:
                this.mouv_diag_BGauche(position_Ccase,position_Lcase);
                break;
        }
    }
    
    public void Tiger(){
        switch(mouv){
            case 1:
                this.mouv_bas(position_Lcase);
                break;
            case 2:
                this.mouv_haut(position_Lcase,2);
                break;
        }
    }
}
