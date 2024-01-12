package Controler;

import Model.Personnage.Joueur;
import Model.Objet.*;
import View.Menu.combat.UICombat;

import java.util.ArrayList;

public class Boutique {
    PotionDeVie potionDeVie = new PotionDeVie("Potion de Vie", "Potion", 20,40);
    PotionDeMana potionDeMana = new PotionDeMana("Potion de Mana", "Potion", 30,30);
    EpeeCourte epeeLongue = new EpeeCourte("Epée Longue","Arme",60,30,"Epée");

    ArrayList<Objet> boutiqueContenu = new ArrayList<Objet>();

    public ArrayList<Objet> getBoutiqueContenu() {
        return boutiqueContenu;
    }

    public void setUpBoutique(){
        boutiqueContenu.add(potionDeVie);
        boutiqueContenu.add(potionDeMana);
        boutiqueContenu.add(epeeLongue);
    }

    public void acheter(){
        if(UICombat.me.getArgent() >= potionDeVie.getPrix()){
            Joueur.addInventaire(potionDeVie);
        }else{
            System.out.println("Vous n'avez pas assez d'argent!");
        }
    }
}