package Model;

public class Joueur extends Personnage{
    int pointDeMana;
    String objetsEquipes;

    public Joueur(String nom, int pointsDeVie, int force, int pointDeMana, String objetsEquipes) {
        super(nom, pointsDeVie, force);
        this.pointDeMana = pointDeMana;
        this.objetsEquipes = objetsEquipes;
    }

    public void interagir(){

    }
    public void attaquer(){

    }

    public void defendre(){

    }
}
