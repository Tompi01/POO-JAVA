package Model.Personnage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import Model.Objet.Epee;
public class Joueur extends Personnage implements Serializable {
    int pointDeMana;
    static String objetsEquipes;
    static int argent;

    public Joueur(String nom, int pointsDeVie, int force, int pointDeMana, String objetsEquipes, boolean estMort,int argent) {
        super(nom, pointsDeVie, force, estMort);
        this.argent=argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public static int getArgent() {
        return argent;
    }

    public static String getObjetsEquipes() {
        return objetsEquipes;
    }

    Epee epee = new Epee("Epée Courte", "Epée", 50,20,"Epée");

    static List<Object> inventaire = new ArrayList<>();
    public static List<Object> getInventaire() {
        return inventaire;
    }

    public Joueur(String nom, int pointsDeVie, int force, boolean estMort, int pointDeMana, String objetsEquipes) {
        super(nom, pointsDeVie, force, estMort);
        this.pointDeMana = pointDeMana;
        this.objetsEquipes = objetsEquipes;
    }

    /**
     * Méthode pour que le joueur attaque
     * Pas encore définie
     */
    public void attaquer(){

    }
    public void fuir(){

    }


    public void setInventaireDepart(){
        inventaire.add(epee);
    }

    public static void addInventaire(Object objet){
            inventaire.add(objet);
    }

}

