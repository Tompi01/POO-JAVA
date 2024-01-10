package Model.Objet;

public class Potion extends Arme{

    int taille;

    public Potion(int pointsDeDegat, String typeDarme, String nom, int taille) {
        super(pointsDeDegat, typeDarme, nom);
        this.taille = taille;
    }
}
