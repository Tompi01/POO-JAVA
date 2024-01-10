package Model.Objet;

public abstract class Objet {
    String nom;
    String categorieObjet;
    boolean estAchetable;
    boolean estVendable;
    public abstract void utiliser();
}