package View.Menu;

import View.Menu.marchand.UIMarchand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inGameMenu {
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Se diriger vers l'origine du cri \r\n2 - Quitter");
        try {
            int answer = scanner.nextInt();
            switch (answer){
                case 1:
                    System.out.println("Au loin vous voyez une damoiselle se faire violenter par un chevalier");
                    plaineMenu.menu();
                    break;
                case 2:
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


