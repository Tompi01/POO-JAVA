package View.Menu.combat;

import Model.Personnage.Joueur;
import Model.Personnage.Tristepin;
import View.Init;
import View.Menu.combat.Attack.magique;
import View.Menu.madameZaza;

import java.util.InputMismatchException;
import java.util.Scanner;


public class UICombat {


    public static Joueur me = Init.initialisation();

    static Tristepin JeanCrampté = new Tristepin("JeanCrampté", 120, 10 + (int)(Math.random() * ((20 - 10) + 1)), false);
    /**
     * Affiche un menu de combat et permet au joueur de choisir une action.
     * Les actions possibles sont :
     * 1 - Attaques physiques (dégâts = `me.getForce()` valeur de force du joueur ou de l'ennemi)
     * 2 - Attaques magiques
     * 3 - Utiliser un objet
     * 4 - Fuir
     */
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Attaques physiques (" + me.getForce() +" dmg)              2 - Attaques magiques \r\n3 - Utiliser un objet                        4 - Fuir");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Vous avez lancer une attaque physique");
                    JeanCrampté.setPointsDeVie(JeanCrampté.getPointsDeVie()-me.getForce());
                    me.setPointsDeVie(me.getPointsDeVie()-JeanCrampté.getForce());
                    System.out.println("PV restant du joueur : " + me.getPointsDeVie());
                    System.out.println("PV restant de JeanCrampté : " + JeanCrampté.getPointsDeVie());
                    if(JeanCrampté.getPointsDeVie()<=0){
                        JeanCrampté.destroyActor("JeanCrampté");
                        System.out.println("\r\nJeanCrampté est mort\r\n");
                        me.setArgent(me.getArgent()+50);
                        madameZaza.menu();
                    } else if (me.getPointsDeVie()<=0) {
                        System.out.println("Vous avez Perdu");
                        break;
                    } else{
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
