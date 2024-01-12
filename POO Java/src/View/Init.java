package View;

import Model.Personnage.Joueur;
import Model.Personnage.Tristepin;

import java.io.Serializable;

public class Init implements Serializable{


    public static String classeStock;


    /** initialisation du personnage nommé JeanCrampté et du personnage du joueur celon la classe qui a été choisi par l'utilisateur */

    public static String getClasseStock() {
        return classeStock;
    }
    public static Joueur initialisation(){
        Tristepin JeanCrampté = new Tristepin("JeanCrampté", 120, 10, false);
        Joueur me = null;
        if (classeStock == "tank"){
            me = new Joueur("MOI", 160, 10,100,"épée courte", false,20);
        } else if (classeStock == "combattant") {
            me = new Joueur("MOI", 100, 20,100,"épée courte", false,20);
        } else if (classeStock == "assassin") {
            me = new Joueur("MOI", 60, 40,100,"épée courte", false,20);
        }
        me.setInventaireDepart();
        return me;
    }
}
