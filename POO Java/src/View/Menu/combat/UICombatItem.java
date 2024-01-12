package View.Menu.combat;

import Model.Objet.Objet;
import View.Menu.inGameMenu;
import View.Menu.plaineMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UICombatItem {
    /**
     * Affiche le menu de l'inventaire et permet à l'utilisateur de choisir une option.
     */
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        int bouttonQuitter = 0;
        for(int i = 0; i < UICombat.me.getInventaire().size(); i++) {
            Object x = UICombat.me.getInventaire().get(i);
            if (x instanceof Objet n){
                System.out.println(i+1 + " - " + ((Objet) x).getNom() +"("+ n.getPrix() +"po) \r\n");

            }
            bouttonQuitter = i+2;
        }
        System.out.println(bouttonQuitter + " - Quitter");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    UICombat.menu();
                    break;
                case 2:
                    UICombat.menu();
                    break;
                case 3:
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
