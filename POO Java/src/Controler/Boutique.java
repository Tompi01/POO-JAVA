package Controler;

import Model.Personnage.Joueur;
import Model.Objet.*;
import View.Menu.combat.UICombat;

import java.util.ArrayList;

public class Boutique {
    PotionDeVie potionDeVie = new PotionDeVie("Potion de Vie", "Potion", 20,40);
    PotionDeMana potionDeMana = new PotionDeMana("Potion de Mana", "Potion", 30,30);
    Epee epeeLongue = new Epee("Epée Longue","Arme",60,30,"Epée");

    ArrayList<Objet> boutiqueContenu = new ArrayList<Objet>();

    public ArrayList<Objet> getBoutiqueContenu() {
        return boutiqueContenu;
    }

    /**
     * Méthode pour implémenter les objets dans la collection de notre boutique.
     */
    public void setUpBoutique(){
        boutiqueContenu.add(potionDeVie);
        boutiqueContenu.add(potionDeMana);
        boutiqueContenu.add(epeeLongue);
    }

    /**
     * Méthode vérifiant que le joueur a assez d'argent pour acheter l'objet et l'ajoute a son inventaire
     * @param objetAchete objet sélectionner par le joueur dans la boutique
     */
    public void acheter(Objet objetAchete){
        if(UICombat.me.getArgent() >= objetAchete.getPrix()){
            Joueur.addInventaire(objetAchete);
        }else{
            System.out.println("Vous n'avez pas assez d'argent!");
        }
    }
}