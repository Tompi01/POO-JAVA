package Model.Personnage;

import java.util.ArrayList;
import java.util.List;
import Model.Objet.EpeeCourte;
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

    EpeeCourte epeeCourte = new EpeeCourte("Epée Courte", "Epée", 50,20,"Epée");

    static List<Object> inventaire = new ArrayList<>();

    public Joueur(String nom, int pointsDeVie, int force, boolean estMort, int pointDeMana, String objetsEquipes) {
        super(nom, pointsDeVie, force, estMort);
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


    public void setInventaireDepart(){
        inventaire.add(epeeCourte);
    }

    public static void addInventaire(Object objet){
            inventaire.add(objet);
    }

    public void modifierInventaire(Object objet, int index){
        inventaire.set(index,objet);
    }

    public  List<Object> getInventaire() {
        return inventaire;
    }
}

