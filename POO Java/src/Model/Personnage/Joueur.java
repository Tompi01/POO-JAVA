package Model.Personnage;

import java.util.ArrayList;
import java.util.List;
import Model.Objet.EpeeCourte;
public class Joueur extends Personnage {
    int pointDeMana;
    String objetsEquipes;
    int argent;

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public static int getArgent() {
        return argent;
    }

    EpeeCourte epeeCourte = new EpeeCourte(1, "Epée", "Epée courte");

    List<Object> inventaire = new ArrayList<>();

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



    public void inventaire(){
        inventaire.add(epeeCourte);
    }
}
