package Model.Personnage;

import Model.Interactable;

import java.lang.annotation.Inherited;

public abstract class Personnage implements Interactable {
    String nom;
    int pointsDeVie;
    int force;

    public Personnage(String nom, int pointsDeVie, int force) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
    }

        public abstract void attaquer();
}
