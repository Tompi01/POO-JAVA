package Model.Personnage;

public class Tristepin extends Personnage {

    int energieArdente;

    public void attaquer(){

    }

    public void defendre(){

    }

    public void cracherDuFeu(){

    }
    public void armureDeFlammes(){
        //Armure de flamme augmentant les dégats d'un montant fixe
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
