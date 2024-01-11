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
    public void utiliserObjet() {

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

    @Override
    public void interagir() {

    }

    @Override
    public void debuterLeCombat() {

    }
    @Override
    public void destroyActor(String actor){
        if(pointsDeVie <= 0){
            actor = null;
        }
    }
}
