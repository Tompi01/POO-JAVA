package View.Menu;

import View.Menu.marchand.UIMarchand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inGameMenu {
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Continuer vers la plaine \r\n2 - Allez voir le marchand \r\n3 - Quitter");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Au loin vous voyez une damoiselle se faire violanter par un chevalier");
                    plaineMenu.menu();
                    break;
                case 2:
                    UIMarchand.marchandMenu();
                    break;
                case 3:
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


