package Model.Objet;

public class PotionDeMana extends Potion {
    int manaRendu;
    public PotionDeMana(int pointsDeDegat, String typeDarme, String nom, int taille, int manaRendu) {
        super(pointsDeDegat, typeDarme, nom, taille);
        this.manaRendu = manaRendu;
    }
}
