package View.Menu.combat;

import View.Menu.combat.Attack.magique;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UICombat {
    public static void menu()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Attaques physiques          2 - Attaques magiques \r\n3 - Utiliser un objet           4 - Fuir");
        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Attaques physiques");
                    //Là on tape le mec en face
                    break;
                case 2:
                    System.out.println("Attaques magiques");
                    magique.menu();
                    break;
                case 3:
                    System.out.println("Objets");
                    UICombatItem.menu();
                    break;
                case 4:
                    System.out.println("Vous ne pouvez pas fuir");
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
