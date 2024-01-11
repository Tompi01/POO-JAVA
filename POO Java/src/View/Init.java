package View;

import Model.Personnage.Joueur;
import Model.Personnage.Tristepin;

public class Init {
    public static void initialisation(){
        Joueur me = new Joueur("MOI", 100, 20,100,"épée courte", false);
        Tristepin JeanCrampté = new Tristepin("JeanCrampté", 120, 10, false);
    }


}
