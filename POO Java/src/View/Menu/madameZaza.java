package View.Menu;

import View.Menu.combat.UICombat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class madameZaza {
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Continuer votre chemin vers le labirynthe \r\n2 - Lui demander des écus en échange de votre aide \r\n3 - Retourner vers la plaine");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Jme casse vers le labirynthe");
                    break;
                case 2:
                    System.out.println("Merci pour ces magnifique écus d'or");
                    
                    break;
                case 3:
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
