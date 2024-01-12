package Model.Personnage;

public class Tristepin extends Personnage {

    int energieArdente;
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
    public void cracherDuFeu(){
    //Inflige de gros dégats au joueur
    }
    /**
     * Méthode pour utiliser la compétence cracherDuFeu
     * Pas encore définie
     */
    public void armureDeFlammes(){
        //Armure de flamme augmentant les dégats infligés d'un montant fixe
    }
    public Tristepin(String nom, int pointsDeVie, int force, boolean estMort) {
        super(nom, pointsDeVie, force,estMort);
    }

    @Override
    public void destroyActor(String actor){
        if(pointsDeVie <= 0){
            actor = null;
        }
    }
}
