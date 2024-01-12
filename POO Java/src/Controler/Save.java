package Controler;

import java.io.*;
import java.util.List;

public class Save {
    public static void saveProgress(Serializable obj, String cheminFichier) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cheminFichier))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveProgressList(List<Object> list, String cheminFichier) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cheminFichier))) {
            // Convertir la liste d'objets en tableau d'objets
            Object[] objArray = list.toArray();
            // Écrire le tableau d'objets dans le flux de sortie
            oos.writeObject(objArray);
            System.out.println("Progression sauvegardée avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
