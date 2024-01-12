package Model.Objet;

public class Arme extends Objet {
   public int pointsDeDegat;
    public String typeDarme;

    public Arme(String nom, String categorieObjet, int prix, int pointsDeDegat, String typeDarme) {
        super(nom, categorieObjet, prix);
        this.pointsDeDegat = pointsDeDegat;
        this.typeDarme = typeDarme;
    }

    /**
     * Méthode héritée de la classe mère "Objet"
     * Non utilisé actuellement pour les armes
     */
    @Override
    public void utiliser() {

    }
}
