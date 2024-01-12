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

    /**
     * Méthode pour utiliser la potions de mana
     * Rends un nombre de points de mana fixe
     * Pas encore définie
     */
    @Override
    public void utiliser() {

    }
}
