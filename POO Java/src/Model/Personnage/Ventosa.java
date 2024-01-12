package Model.Personnage;

public class Ventosa extends Personnage {

    int energieDeLair;
    /**
     * Méthode pour permettre aux ennemis nommé issus de cette classe d'attaquer
     * Pas encore définie
     */
    public void attaquer(){

    }
    /**
     * Méthode pour utiliser la compétence Souffle de l'air
     * Pas encore définie
     */
    public void souffleDeLair(){
    //Attaque inflige des degats élevés
    }
    /**
     * Méthode pour utiliser la compétence Armure des Vents
     * Pas encore définie
     */
    public void armureDesVents(){
    //Armure qui renvoie une partie des dégats reçus
    }

    public Ventosa(String nom, int pointsDeVie, int force, boolean estMort) {
        super(nom, pointsDeVie, force, estMort);
    }
}
