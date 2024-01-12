package Model.Objet;

public abstract class Objet {
    String nom;
    String categorieObjet;
    int prix;
    boolean estAchetable;
    boolean estVendable;

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Objet(String nom, String categorieObjet, int prix) {
        this.nom = nom;
        this.categorieObjet = categorieObjet;
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    public abstract void utiliser();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}