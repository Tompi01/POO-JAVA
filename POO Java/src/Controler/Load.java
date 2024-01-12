package Controler;

import java.io.*;
import java.util.List;

public class Load {
    public static Serializable loadProgress(String cheminFichier) {
        Serializable obj = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cheminFichier))) {
            obj = (Serializable) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }
    public static List<Object> loadProgressList(String cheminFichier) {
        List<Object> list = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cheminFichier))) {
            Object[] objArray = (Object[]) ois.readObject();
            list = List.of(objArray);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}