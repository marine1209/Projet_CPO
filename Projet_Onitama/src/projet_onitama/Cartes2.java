/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

import java.util.ArrayList;

/**
 *
 * @author marin
 */
public class Cartes2 {

    String nom;

    public Cartes2(String nom) {
        this.nom = nom;
    }

    public ArrayList deplacement_possible(int ligne, int colonne) {
        ArrayList<ArrayList<Integer>> déplacementPossibles = new ArrayList<ArrayList<Integer>>();

        switch (this.nom) {
            case "boar":
            ajouterCoordonnees(déplacementPossibles, ligne + 1, colonne);
            ajouterCoordonnees(déplacementPossibles, ligne, colonne + 1);
            ajouterCoordonnees(déplacementPossibles, ligne + 1, colonne + 1);
              break;
            
            case "cobra": 
            ajouterCoordonnees(déplacementPossibles, ligne -1, colonne);
            ajouterCoordonnees(déplacementPossibles, ligne-1, colonne - 1);
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne + 1);
              break;
              
            case "crab": 
            ajouterCoordonnees(déplacementPossibles, ligne , colonne+2);
            ajouterCoordonnees(déplacementPossibles, ligne, colonne-2 );
            ajouterCoordonnees(déplacementPossibles, ligne+1 , colonne );
            break;
            
            case "crane" : 
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne);
            ajouterCoordonnees(déplacementPossibles, ligne-1, colonne + 1);
            ajouterCoordonnees(déplacementPossibles, ligne -1, colonne -1);
            break;
            
            case "dragon":
            ajouterCoordonnees(déplacementPossibles, ligne -1, colonne+1);
            ajouterCoordonnees(déplacementPossibles, ligne+2, colonne + 2);
            ajouterCoordonnees(déplacementPossibles, ligne +2, colonne -2);   
            ajouterCoordonnees(déplacementPossibles, ligne -1, colonne -1); 
            break;
            
            case "eel": 
            ajouterCoordonnees(déplacementPossibles, ligne, colonne +1); 
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne-1);   
            ajouterCoordonnees(déplacementPossibles, ligne -1, colonne -1);
            break;
            
            case "elephant": 
            ajouterCoordonnees(déplacementPossibles, ligne , colonne +1);   
            ajouterCoordonnees(déplacementPossibles, ligne , colonne -1);  
            ajouterCoordonnees(déplacementPossibles, ligne +1,colonne -1);   
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne +1);
            break;
            
            case "frog":
            ajouterCoordonnees(déplacementPossibles, ligne-1 , colonne +1);   
            ajouterCoordonnees(déplacementPossibles, ligne-1 , colonne -1);  
            ajouterCoordonnees(déplacementPossibles, ligne ,colonne -2);   
            break ; 
            
            case "goose":
            ajouterCoordonnees(déplacementPossibles, ligne , colonne +1);   
            ajouterCoordonnees(déplacementPossibles, ligne , colonne -1);  
            ajouterCoordonnees(déplacementPossibles, ligne +1,colonne -1);   
            ajouterCoordonnees(déplacementPossibles, ligne -1, colonne +1);
            break;
            
            case "horse":
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne );   
            ajouterCoordonnees(déplacementPossibles, ligne -1 , colonne) ;  
            ajouterCoordonnees(déplacementPossibles, ligne ,colonne -1);   
            break;
            
            case "mantis":
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne +1);   
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne -1);  
            ajouterCoordonnees(déplacementPossibles, ligne -1,colonne );   
            break;
            
            case "monkey":
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne +1);   
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne -1);  
            ajouterCoordonnees(déplacementPossibles, ligne -1,colonne -1);   
            ajouterCoordonnees(déplacementPossibles, ligne -1, colonne +1);
            break;
            
            case "ox":
            ajouterCoordonnees(déplacementPossibles, ligne+1 , colonne );   
            ajouterCoordonnees(déplacementPossibles, ligne+1 , colonne );  
            ajouterCoordonnees(déplacementPossibles, ligne ,colonne +1);
            break;
            
            case "tiger":
            ajouterCoordonnees(déplacementPossibles, ligne +2, colonne );   
            ajouterCoordonnees(déplacementPossibles, ligne -1, colonne ); 
            break;
            
            case "rabbit":
            ajouterCoordonnees(déplacementPossibles, ligne+1 , colonne +1);   
            ajouterCoordonnees(déplacementPossibles, ligne , colonne -2);  
            ajouterCoordonnees(déplacementPossibles, ligne -1,colonne -1);   
            break;
            
            case "rooster":
            ajouterCoordonnees(déplacementPossibles, ligne , colonne +1);   
            ajouterCoordonnees(déplacementPossibles, ligne , colonne -1);  
            ajouterCoordonnees(déplacementPossibles, ligne -1,colonne -1);   
            ajouterCoordonnees(déplacementPossibles, ligne +1, colonne +1);
            break;
        }
        return déplacementPossibles;
    }

    public ArrayList deplacementVraimentsPossibles(ArrayList<ArrayList<Integer>>  déplacements, int ligne, int colonne) {
        for (int i = 0; i < déplacements.size(); i++) {
            for (int j = 0; j<2; j++){
              if (déplacements.get(i).get(j) < 0 || déplacements.get(i).get(j) > 5){ 
                déplacements.remove(i); 
            }

            }
            
        }
        return déplacements; 
}
    private void ajouterCoordonnees(ArrayList<ArrayList<Integer>> déplacementPossibles, int nouvelleLigne, int nouvelleColonne) {
        ArrayList<Integer> coordonnees = new ArrayList<>();
        coordonnees.add(nouvelleLigne);
        coordonnees.add(nouvelleColonne);
        déplacementPossibles.add(coordonnees);
}
}
    

