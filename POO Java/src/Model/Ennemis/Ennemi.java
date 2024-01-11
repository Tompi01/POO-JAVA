package Model.Ennemis;

public abstract class Ennemi{
 int pointDeVie;
 int degatAttaque;

 String nom;

 public Ennemi(int pointDeVie, int degatAttaque, String nom) {
 }

 public abstract void taper();
}

