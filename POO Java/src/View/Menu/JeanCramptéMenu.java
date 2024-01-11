package View.Menu;

import View.Menu.combat.UICombat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JeanCramptéMenu {
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Vous battre contre le chevalier \r\n2 - Essayer de discuter avec lui \r\n3 - Partir");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("JeanCrampté veut se battre");
                    UICombat.menu();
                    break;
                case 2:
                    System.out.println("JeanCrampté n'est pas quelqu'un qui discute");
                    UICombat.menu();
                    break;
                case 3:
                    System.out.println("Quitter");
                    plaineMenu.menu();
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
