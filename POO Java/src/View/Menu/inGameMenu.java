package View.Menu;

import View.Menu.marchand.UIMarchand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inGameMenu {
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Allez voir le marchand \r\n2 - Aller voir JeanCrampté \r\n3 - Quitter");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    UIMarchand.marchandMenu();
                    break;
                case 2:
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


