package View.Menu.marchand;

import View.Dialogue;
import View.Menu.inGameMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UIMarchand {
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
                    inGameMenu.menu();
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

