package Model.Ennemis;

public class ChauveSouris extends Ennemi{
    public ChauveSouris(int pointDeVie, int degatAttaque, String nom) {
        super(pointDeVie, degatAttaque, nom);
    }

    @Override
    public void taper() {

    }

    public void sucerSang(){
        //Récupère un petit nombre de point de vie après utilisation
    }
}
