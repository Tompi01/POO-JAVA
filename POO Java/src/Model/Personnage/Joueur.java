package Model.Personnage;

public class Joueur extends Personnage {
    int pointDeMana;
    String objetsEquipes;
    int argent;

    public Joueur(String nom, int pointsDeVie, int force, int pointDeMana, String objetsEquipes) {
        super(nom, pointsDeVie, force);
        this.pointDeMana = pointDeMana;
        this.objetsEquipes = objetsEquipes;
    }

    public void interagir(){

    }

    @Override
    public void debuterLeCombat() {

    }

    public void attaquer(){

    }
    public void seDeplacer(){

    }
    public void utiliserObjet(){

    }

    @Override
    public void parlerPNJ() {

    }

    @Override
    public void acheter() {

    }

    @Override
    public void vendre() {

    }

    public void fuir(){

    }
}
