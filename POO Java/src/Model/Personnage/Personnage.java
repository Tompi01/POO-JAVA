package Model.Personnage;

public abstract class Personnage {
    String nom;
    int pointsDeVie;
    int force;

    boolean estMort;

    public Personnage(String nom, int pointsDeVie, int force,boolean estMort) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
        this.estMort = estMort;
    }

    public boolean isEstMort() {
        return estMort;
    }

    public void setEstMort(boolean estMort) {
        this.estMort = estMort;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
        pointsDeVie = 100;
    }

    public void setForce(int force) {
        this.force = force;
        force = 20;
    }

    public abstract void attaquer();

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getForce() {
        return force;
    }
    public void destroyActor(String actor){
        if(pointsDeVie <= 0){
            setEstMort(true);
            actor = null;
        }
    }
}
