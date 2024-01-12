package View.Menu;

import Model.Objet.Objet;
import View.Menu.combat.UICombat;
import View.Menu.marchand.UIMarchand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZoneSauvegarde {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vous arrivez devant un immense labyrinthe! Que voulez vous faire? \r\n1 - Entrez dans le labyrinthe \r\n2 - Allez voir le marchand du labyrinthe \r\n3 - Ouvrir l'invetaire \r\n 4 - Vous reposez (Sauvegarder et quitter)");
        try {
            int response = scanner.nextInt();

            switch (response) {
                case 1:
                    break;
                case 2:
                    UIMarchand.marchandMenu();
                    break;
                case 3:
                    for(int i = 0; i < UICombat.me.getInventaire().size(); i++) {
                        Object x = UICombat.me.getInventaire().get(i);
                        if (x instanceof Objet n){
                            System.out.println(((Objet) x).getNom() + "\r\n");
                        }
                    }break;
                case 4:
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
