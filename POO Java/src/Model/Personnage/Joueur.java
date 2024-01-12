package Model.Personnage;

import java.util.ArrayList;
import java.util.List;
import Model.Objet.Epee;
public class Joueur extends Personnage {
    int pointDeMana;
    String objetsEquipes;
    static int argent;

    public Joueur(String nom, int pointsDeVie, int force, int pointDeMana, String objetsEquipes, boolean estMort,int argent) {
        super(nom, pointsDeVie, force, estMort);
        this.argent=argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public int getArgent() {
        return argent;
    }

    Epee epee = new Epee("Epée Courte", "Epée", 50,20,"Epée");

    static List<Object> inventaire = new ArrayList<>();
    public  List<Object> getInventaire() {
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

    /**
     * Méthode qui nous fait retourner a la zone safe précédente la plus proche
     * Non utilisable contre les boss
     * Pas encore définie
     */
    public void fuir(){

    }

    /**
     * Ajoute l'épée de départ au joueur lorsqu'il est initialisé
     */
    public void setInventaireDepart(){
        inventaire.add(epee);
    }

    /**
     * Méthode qui ajoute un objet a l'inventaire du joueur
     * @param objet objet à ajouter a l'inventaire
     */
    public static void addInventaire(Object objet){
            inventaire.add(objet);
    }

}

