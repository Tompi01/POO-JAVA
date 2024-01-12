package Model.Personnage;

public class Terria extends Personnage {

    int energieTerrestre;

    public void attaquer(){

    }

    public void defendre(){

    }

    public void lanceDeLaTerre(){

    }
    public void armureDeFlammes(){
        //Armure qui augmente la défense ou qui réduit les dégats subis
    }

    public Terria(String nom, int pointsDeVie, int force, boolean estMort) {
        super(nom, pointsDeVie, force, estMort);
    }
}
