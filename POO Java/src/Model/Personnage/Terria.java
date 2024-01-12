package Model.Personnage;

public class Terria extends Personnage {

    int energieTerrestre;

    /**
     * Méthode pour permettre aux ennemis nommé issus de cette classe d'attaquer
     * Pas encore définie
     */
    public void attaquer(){

    }
    /**
     * Méthode pour utiliser la compétence cracherDuFeu
     * Pas encore définie
     */
    public void lanceDeLaTerre(){
    //Inflige des dégats élevés au joueur et baisse sa défense
    }
    /**
     * Méthode pour utiliser la compétence Armure de flammpe
     * Pas encore définie
     */
    public void armureDeTerre(){
        //Armure qui augmente la défense ou qui réduit les dégats subis
    }

    public Terria(String nom, int pointsDeVie, int force, boolean estMort) {
        super(nom, pointsDeVie, force, estMort);
    }

}
