package View.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZoneSauvegarde {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vous arrivez devant un immense labyrinthe! Que voulez vous faire? \r\n1 - Entrez dans le labyrinthe \r\n2 - Allez voir le marchand du labyrinthe \r\n3 - Vous reposez (Sauvegarder et quitter)");
        try {
            int response = scanner.nextInt();
            switch (response) {
                case 1:
                    System.out.println("Quitter");
                    break;
                case 2:
                    System.out.println("Quitter");
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
        } catch (InputMismatchException e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Entrée invalide");
            menu();
        }
    }
}
