package Model.Objet;

public class PotionDeVie extends Potion{
    int pvRendu;
    public PotionDeVie(int pointsDeDegat, String typeDarme, String nom, int taille, int pvRendu) {
        super(pointsDeDegat, typeDarme, nom, taille);
        this.pvRendu = pvRendu;
    }
}
