package View.Menu;

import View.Init;

import java.util.InputMismatchException;
import java.util.Scanner;

public class personnageSelector {
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Le tank (Beaucoup de PV mais peu de dégats) \r\n2 - Le combattant (Dégats et PV moyen) \r\n3 - L'assasin (Beaucoup de dégats mais peu de PV) \r\n4 - Quitter");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    Init.classeStock = "tank";
                    System.out.println("Vous avez choisi le tank\r\n");
                    System.out.println("Vous arrivez près d'une étrange boutique");
                    inGameMenu.menu();
                case 2:

                    Init.classeStock = "combattant";
                    System.out.println("Vous avez choisi le combattant\r\n");
                    System.out.println("Vous arrivez près d'une étrange boutique");
                    inGameMenu.menu();
                case 3:

                    Init.classeStock = "assassin";
                    System.out.println("Vous avez choisi l'assasin\r\n");
                    System.out.println("Vous arrivez près d'une étrange boutique");
                    inGameMenu.menu();
                case 4:
                    System.out.println("Quitter");
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
