package View.Menu.marchand;

import View.Menu.combat.UICombat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UIMarchand {
    /**
     * Affiche le menu du marchand et permet à l'utilisateur de choisir une option.
     * Il peut acheter un objet parmi les objets disponible dans la collection boutique
     * Il peut vendre un objet présent dans son inventaire
     * Il peut revenir au menu précédent
     */
    public static void marchandMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que voulez vous faire ? \r\n 1 - Acheter \r\n 2 - Vendre \r\n 3 - Quitter");

        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    UIMarchandAchat.achatMenu();
                    break;
                case 2:
                    UIMarchandVendre.vendreMenu();
                    break;
                case 3:
                    System.out.println("Vous sortez de la boutique");
                    UICombat.menu();
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Invalide");
                    marchandMenu();
                    break;
            }
        } catch (InputMismatchException e)
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Entrée invalide");
            marchandMenu();
        }
    }
}

