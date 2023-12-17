/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    String nom;
    ArrayList coord_temp = new ArrayList<Integer>();
    
    
    public Cartes(CaseGrille[][] matriceCellules) {
        this.matriceCellules = matriceCellules;
        this.position_Ccase=position_Ccase;
        this.position_Lcase=position_Lcase;
        try {
            Method method = this.getClass().getMethod("Cobra");
            method.invoke(this);
        } catch (Exception ex) {
        }

    }
    public void mouv_droite(int position_Lcase, int position_Ccase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase][position_Ccase+1];
    }
    
    public void mouv_gauche(int position_Lcase, int position_Ccase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase][position_Ccase-1];
    }
    
    public void mouv_haut(int position_Lcase, int position_Ccase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase-1][position_Ccase];
    }
    
    public void mouv_bas(int position_Lcase, int position_Ccase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase+1][position_Ccase];
    }
    
    public void mouv_diag_HDroite(int position_Ccase,int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase-1][position_Ccase+1];
    }
    
    public void mouv_diag_HGauche(int position_Ccase,int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase-1][position_Ccase-1];
    }
    
    public void mouv_diag_BGauche(int position_Ccase,int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase+1][position_Ccase-1];
    }
    
    public void mouv_diag_BDroite(int position_Ccase,int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase+1][position_Ccase+1];
    }
    
    public void mouv_droite_particulier(int position_Ccase, int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase-1][position_Ccase+2];
    }
    
    public void mouv_gauche_particulier(int position_Ccase, int position_Lcase){
        matriceCellules[position_Lcase][position_Ccase]=matriceCellules[position_Lcase-1][position_Ccase-2];
    }
    
    public void Boar(int ligne, int colonne){
        this.nom = "Boar";
        switch (mouv){
        case 1:
            this.mouv_droite(position_Ccase,position_Lcase);
            break;
        
        case 2:
            //une case en haut
            this.mouv_haut(position_Lcase,position_Ccase);
            break;
        
        case 3:
            this.mouv_gauche(position_Ccase,position_Lcase);
            break;
        
        
        }
    }

    
    public ArrayList Cobra(Pions pion){
        this.nom = "Cobra";
        switch(mouv){
            case 1:
                coord_temp.add(pion.getPosition_ligne());
                coord_temp.add(pion.getPosition_colonne());
                this.mouv_gauche(((Integer) coord_temp.get(0)).intValue(),((Integer) coord_temp.get(1)).intValue());
                if (verif_position(((Integer) coord_temp.get(0)).intValue(),((Integer) coord_temp.get(1)).intValue()) == true && peuxManger(pion) == true) {)
                this.mouv_gauche(position_Ccase,position_Lcase);
                break;
            case 2:
                this.mouv_diag_HDroite(position_Ccase,position_Lcase);
                break;
            case 3:
                this.mouv_diag_BDroite(position_Ccase,position_Lcase);
                break;
        }
    }
    }
    
    public void Crab(){
        this.nom = "Crab";
        switch(mouv){
            case 1:
                this.mouv_haut(position_Lcase,position_Ccase);
                break;
            case 2:
                this.mouv_droite(position_Ccase,position_Lcase);
                this.mouv_droite(position_Ccase,position_Lcase);
                break;
            case 3:
                this.mouv_gauche(position_Ccase,position_Lcase);
                this.mouv_gauche(position_Ccase,position_Lcase);
                break;
        }
    }
    
    public  void Crane(){
        this.nom = "Crane";
        switch(mouv){
            case 1:
                this.mouv_haut(position_Lcase,position_Ccase);
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
        this.nom = "Dragon";
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
        this.nom = "Eel";
        switch (mouv){
            case 1:
                this.mouv_droite(position_Ccase, position_Lcase);
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
        this.nom = "Elephant";
        switch (mouv){
            case 1:
                this.mouv_diag_HDroite(position_Ccase, position_Lcase);
                break;
            case 2:
                this.mouv_diag_HGauche(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_droite(position_Ccase, position_Lcase);
                break;
            case 4:
                this.mouv_gauche(position_Ccase,position_Lcase);
                break;
        }
    }
    
    public void Frog(){
        this.nom = "Frog";
        switch(mouv){
            case 1:
                this.mouv_gauche(position_Ccase,position_Lcase);
                this.mouv_gauche(position_Ccase,position_Lcase);
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
        this.nom = "Goose";
        switch(mouv){
            case 1:
                this.mouv_gauche(position_Ccase,position_Lcase);
                break;
            case 2:
                this.mouv_droite(position_Ccase,position_Lcase);
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
        this.nom = "Horse";
        switch(mouv){
            case 1:
                this.mouv_bas(position_Lcase, position_Ccase);
                break;
            case 2:
                this.mouv_haut(position_Lcase,position_Ccase);
                break;
            case 3:
                this.mouv_gauche(position_Ccase, position_Lcase);
        }
    }
    
    public void Mantis(){
        this.nom = "Mantis";
        switch(mouv){
            case 1:
                this.mouv_diag_HDroite(position_Ccase,position_Lcase);
                break;
            case 2:
                this.mouv_diag_HGauche(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_bas(position_Lcase, position_Ccase);
                break;
        }
    }
    
    public void Monkey(){
        this.nom = "Monkey";
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
        this.nom = "Ox";
        switch (mouv){
            case 1:
                this.mouv_bas(position_Lcase, position_Ccase);
                break;
            case 2:
                this.mouv_haut(position_Lcase,position_Ccase);
                break;
            case 3:
                this.mouv_droite(position_Ccase, position_Lcase);
                break;
        }
    }
    
    public void Rabbit(){
        this.nom = "Rabbit";
        switch (mouv){
            case 1:
                this.mouv_diag_HDroite(position_Ccase, position_Lcase);
                break;
            case 2:
                this.mouv_diag_BGauche(position_Ccase, position_Lcase);
                break;
            case 3:
                this.mouv_droite(position_Ccase, position_Lcase);
                this.mouv_droite(position_Ccase, position_Lcase);
                break;
        }
    }
    
    public void Rooster(){
        this.nom = "Rooster";
        switch (mouv){
            case 1:
                this.mouv_droite(position_Ccase, position_Lcase);
                break;
            case 2:
                this.mouv_gauche(position_Ccase, position_Lcase);
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
        this.nom = "Tiger";
        switch(mouv){
            case 1:
                this.mouv_bas(position_Lcase, position_Ccase);
                break;
            case 2:
                this.mouv_haut(position_Lcase,position_Ccase);
                this.mouv_haut(position_Lcase,position_Ccase);
                break;
        }
    }
}
