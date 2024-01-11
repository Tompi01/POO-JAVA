package Controler;

import Model.Personnage.Joueur;
public class Boutique {

    public void acheter(){
        if(Joueur.getArgent() == prixobjet){
            Joueur.setIventaire(objetacheté);
        }
    }
}
