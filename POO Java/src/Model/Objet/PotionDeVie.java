package Model.Objet;

public class PotionDeVie extends Potion{
    int pvRendu;

    public PotionDeVie(String nom, String categorieObjet, int prix,int pvRendu) {
        super(nom, categorieObjet, prix);
        this.pvRendu = pvRendu;
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
     * Méthode pour utiliser la potions de vie
     * Rends un nombre de points de vie fixe
     * Pas encore définie
     */
    @Override
    public void utiliser() {
    }
}
