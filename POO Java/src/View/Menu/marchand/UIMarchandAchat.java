package View.Menu.marchand;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UIMarchandAchat {
    public static void achatMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Potion de vitalité \r\n2 - Potion de mana \r\n3 - Épée en bois \r\n4 - Bouclier en bois \r\n5 - Quitter");

        try {
            int response = scanner.nextInt();
            switch (response){
                case 1:
                    System.out.println("Vous avez acheter une potion de vitalité");
                    break;
                case 2:
                    System.out.println("Vous avez acheter une potion de mana");
                    break;
                case 3:
                    System.out.println("Vous avez acheter une épée en bois");
                    break;
                case 4:
                    System.out.println("Vous avez acheter un bouclier en bois");
                    break;
                case 5:
                    //System.out.println("Quitter");
                    UIMarchand.marchandMenu();
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Invalide");
                    UIMarchand.marchandMenu();
                    break;
            }
        } catch (InputMismatchException e)
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Entrée invalide");
            UIMarchand.marchandMenu();
        }
    }
}

