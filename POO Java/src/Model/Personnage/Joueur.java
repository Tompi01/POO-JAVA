package Model.Personnage;

public class Joueur extends Personnage {
    int pointDeMana;
    String objetsEquipes;
    int argent;

    public Joueur(String nom, int pointsDeVie, int force, int pointDeMana, String objetsEquipes, boolean estMort) {
        super(nom, pointsDeVie, force, estMort);

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public static int getArgent() {
        return argent;
    }

    EpeeCourte epeeCourte = new EpeeCourte(1, "Epée", "Epée courte");

    List<Object> inventaire = new ArrayList<>();
        this.pointDeMana = pointDeMana;
        this.objetsEquipes = objetsEquipes;
    }

    public void interagir(){

    }

    @Override
    public void debuterLeCombat() {

    }

    public void attaquer(){

    }
    public void seDeplacer(){

    }
    public void utiliserObjet(){

    }

    @Override
    public void parlerPNJ() {

    }

    @Override
    public void acheter() {

    }

    @Override
    public void vendre() {

    }

    public void fuir(){

    }


    public void setInventaireDepart(){
        inventaire.add(epeeCourte);
    }

    public static void addInventaire(Object objet){
        inventaire.add(objet);
    }
}

