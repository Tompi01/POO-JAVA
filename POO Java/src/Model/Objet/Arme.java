package Model.Objet;

public class Arme extends Objet {
   public int pointsDeDegat;
    public String typeDarme;

    public Arme(String nom, String categorieObjet, int prix, int pointsDeDegat, String typeDarme) {
        super(nom, categorieObjet, prix);
        this.pointsDeDegat = pointsDeDegat;
        this.typeDarme = typeDarme;
    }

    @Override
    public void utiliser() {

    }
}
