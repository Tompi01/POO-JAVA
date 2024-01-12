package View;

import Model.Personnage.Joueur;
import View.Menu.combat.UICombat;
import View.Menu.inGameMenu;
import View.Menu.personnageSelector;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cli {

    public static void startMenu()
            /** startMenu affiche un menu avec deux options: “Jouer” et “Quitter”.*/
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Jouer \r\n2 - Quitter");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Quelle personnage voulez vous jouez ?");
                    personnageSelector.menu();
                case 2:
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Invalide");
                    startMenu();
                    break;
            }
        } catch (InputMismatchException e)
        {
            /** *Si l’utilisateur entre autre chose, la méthode affiche “Invalide” avant d’appeler la méthode menu*/
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Entrée invalide");
            startMenu();
        }
    }
}
