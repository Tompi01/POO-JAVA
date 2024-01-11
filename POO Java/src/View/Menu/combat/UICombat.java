package View.Menu.combat;

import Model.Personnage.Joueur;
import Model.Personnage.Personnage;
import Model.Personnage.Tristepin;
import View.Init;
import View.Menu.JeanCramptéMenu;
import View.Menu.combat.Attack.magique;
import View.Menu.madameZaza;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UICombat {

    static Joueur me = new Joueur("MOI", 100, 20,100,"épée courte", false);
    static Tristepin JeanCrampté = new Tristepin("JeanCrampté", 120, 10, false);
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Attaques physiques (" + me.getForce() +" dmg)              2 - Attaques magiques \r\n3 - Utiliser un objet                        4 - Fuir");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Vous avez lancer une attaque physique");
                    //Là on tape le mec en face
                    JeanCrampté.setPointsDeVie(JeanCrampté.getPointsDeVie()-me.getForce());
                    me.setPointsDeVie(me.getPointsDeVie()-JeanCrampté.getForce());
                    System.out.println("PV restant du joueur : " + me.getPointsDeVie());
                    System.out.println("PV restant de JeanCrampté : " + JeanCrampté.getPointsDeVie());
                    if(JeanCrampté.getPointsDeVie()<=0){
                        JeanCrampté.destroyActor("JeanCrampté");
                        System.out.println("\r\nJeanCrampté est mort\r\n");
                        madameZaza.menu();
                    }
                    else{
                        UICombat.menu();
                    }
                    break;
                case 2:
                    System.out.println("Attaques magiques");
                    magique.menu();
                    break;
                case 3:
                    System.out.println("Objets");
                    UICombatItem.menu();
                    break;
                case 4:
                    System.out.println("Vous ne pouvez pas fuir");
                    UICombat.menu();
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Invalide");
                    menu();
                    break;
            }
        } catch (InputMismatchException e)
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Entrée invalide");
            menu();
        }
    }
}
