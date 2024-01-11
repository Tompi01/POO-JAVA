package Controler;

import Model.Personnage.Joueur;
import Model.Objet.*;

import java.util.ArrayList;

public class Boutique {
    PotionDeVie potionDeVie = new PotionDeVie("Potion de Vie", "Potion", 20,40)
    ArrayList<Object> boutique = new ArrayList<Object>();
     public void setBoutique(){
         boutique.add(potionDeVie);
     }

    public void acheter(){
        if(Joueur.getArgent() >= potionDeVie.getPrix()){
            Joueur.addInventaire(potionDeVie);
        }else{
            System.out.println("Vous n'avez pas assez d'argent!");
        }
    }
}
