package Model.Objet;

public class PotionDeMana extends Potion {
    int manaRendu;

    public PotionDeMana(String nom, String categorieObjet, int prix, int manaRendu) {
        super(nom, categorieObjet, prix);
        this.manaRendu = manaRendu;
    }

    @Override
    public void setPrix(int prix) {
        super.setPrix(prix);
    }

    @Override
    public int getPrix() {
        return super.getPrix();
    }
}
