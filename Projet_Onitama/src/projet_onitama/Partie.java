/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_onitama;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author marin
 */
public class Partie {
    
    /**
     * Effectue un tirage aléatoire de cartes parmi une liste prédéfinie de noms de cartes.
     * @return
     */
    public ArrayList tirageCartes (){
        ArrayList<Cartes2> cartesTirees = new ArrayList <Cartes2>();
        ArrayList<String> nomCartes = new ArrayList<String>();
        nomCartes.add("boar");
        nomCartes.add("cobra");
        nomCartes.add("crab");
        nomCartes.add("cane");
        nomCartes.add("dragon");
        nomCartes.add("eel");
        nomCartes.add("elephant");
        nomCartes.add("frog");
        nomCartes.add("goose");
        nomCartes.add("horse");
        nomCartes.add("mantis");
        nomCartes.add("monkey");
        nomCartes.add("ox");
        nomCartes.add("rabbit");
        nomCartes.add("rooster");
        nomCartes.add("tiger");
        Random random = new Random();
        for (int i =0; i<5; i++){
            int nombreTireAuHasard = random.nextInt(16);
            String nomCarteTiree = nomCartes.get(nombreTireAuHasard);
            cartesTirees.add(new Cartes2(nomCarteTiree));
        }
    return cartesTirees;   
    } 
    
    
}
