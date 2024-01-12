package View.Menu;

import View.Menu.marchand.UIMarchand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class plaineMenu {
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Aller lui porter secours \r\n2 - Ne rien faire \r\n3 - Revenir près du marchand");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Vous arrivez devant JeanCrampté. Madame Zaza vous supplie de l'aider");
                    JeanCramptéMenu.menu();
                    break;
                case 2:
                    plaineMenu.menu();
                    break;
                case 3:
                    System.out.println("Quitter");
                    inGameMenu.menu();
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
