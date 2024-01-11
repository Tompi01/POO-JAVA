package Model.Objet;

public class Potion extends Objet{

    public Potion(String nom, String categorieObjet, int prix) {
        super(nom, categorieObjet, prix);
    }

    @Override
    public void setPrix(int prix) {
        super.setPrix(prix);
    }

    @Override
    public int getPrix() {
        return super.getPrix();
    }

    @Override
    public void utiliser() {

    }
}
