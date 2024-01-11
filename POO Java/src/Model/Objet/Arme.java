package Model.Objet;

public class Arme extends Objet {
   public int pointsDeDegat;
    public String typeDarme;
    public String nom;

    public Arme(int pointsDeDegat, String typeDarme, String nom) {
        this.pointsDeDegat = pointsDeDegat;
        this.typeDarme = typeDarme;
        this.nom = nom;
    }

    @Override
    public void utiliser() {

    }
}
