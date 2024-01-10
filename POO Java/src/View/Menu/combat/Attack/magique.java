package View.Menu.combat.Attack;

import View.Menu.inGameMenu;
import View.Menu.plaineMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class magique {
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Flèche de givre \r\n2 - Tempête de d'éclairs \r\n3 - Sceaux de protection \r\n4 - Main de guérison");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Flèche de givre");

                    break;
                case 2:
                    System.out.println("Tempête de d'éclairs");
                    break;
                case 3:
                    System.out.println("Sceaux de protection");
                    inGameMenu.menu();
                    break;
                case 4:
                    System.out.println("Main de guérison");
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
