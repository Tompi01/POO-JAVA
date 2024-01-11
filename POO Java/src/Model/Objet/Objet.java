package Model.Objet;

public abstract class Objet {
    String nom;
    String categorieObjet;
    int prix;
    boolean estAchetable;
    boolean estVendable;
    public abstract void utiliser();
}