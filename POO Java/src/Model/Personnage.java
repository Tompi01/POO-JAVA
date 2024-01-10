package Model;

public abstract class Personnage {
    String nom;
    int pointsDeVie;
    int force;

    public Personnage(String nom, int pointsDeVie, int force) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
    }

        public abstract void attaquer();

        public abstract void defendre();
}
