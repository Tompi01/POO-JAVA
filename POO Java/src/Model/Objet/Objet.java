package Model.Objet;

public abstract class Objet {
    String nom;
    String categorieObjet;
    int prix;
    public int getPrix() {
        return prix;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public Objet(String nom, String categorieObjet, int prix) {
        this.nom = nom;
        this.categorieObjet = categorieObjet;
        this.prix = prix;
    }

    /**
     * Méthode pour utliser les objets utilisables tels que les potions
     */
    public abstract void utiliser();

}