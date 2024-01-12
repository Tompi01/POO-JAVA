package View.Menu.marchand;

import java.util.InputMismatchException;
import java.util.Scanner;
import Controler.Boutique;
import Model.Objet.*;
import Model.Personnage.Joueur;
import View.Menu.combat.UICombat;

public class UIMarchandAchat {
    public static void achatMenu(){
        Scanner scanner = new Scanner(System.in);
        Boutique boutique = new Boutique();
        int bouttonQuitter = 0;
        Object addInventaire;
        boutique.setUpBoutique();
        for(int i = 0; i < boutique.getBoutiqueContenu().size(); i++) {
            Object x = boutique.getBoutiqueContenu().get(i);
            if (x instanceof Objet n){
                System.out.println(i+1 + " - " + ((Objet) x).getNom() +"("+ n.getPrix() +"po) \r\n");

            }
            bouttonQuitter = i+2;
        }
        System.out.println(bouttonQuitter + " - Quitter");
        try {
            int response = scanner.nextInt();
            if (response == boutique.getBoutiqueContenu().size()+1){
                UIMarchand.marchandMenu();
            }
            Objet objetBoutique = boutique.getBoutiqueContenu().get(response - 1);
            switch (response){
                case 1:
                    System.out.println("Vous avez acheter une potion de vitalité");
                    if(UICombat.me.getArgent()>=objetBoutique.getPrix()){
                        Joueur.addInventaire(objetBoutique);
                    }else{
                        System.out.println("Vous n'avez pas assez d'argent");
                    }
                    UIMarchandAchat.achatMenu();
                    break;
                case 2:
                    if(UICombat.me.getArgent()>=objetBoutique.getPrix()){
                        Joueur.addInventaire(objetBoutique);
                    }else{
                        System.out.println("Vous n'avez pas assez d'argent");
                    }
                    UIMarchandAchat.achatMenu();
                    break;
                case 3:
                    if(UICombat.me.getArgent()>=objetBoutique.getPrix()){
                        Joueur.addInventaire(objetBoutique);
                    }else{
                        System.out.println("Vous n'avez pas assez d'argent");
                    }
                    UIMarchandAchat.achatMenu();
                    break;
                case 4:
                    //System.out.println("Quitter");
                    UIMarchand.marchandMenu();
                    break;
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Invalide");
                    UIMarchandAchat.achatMenu();
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

