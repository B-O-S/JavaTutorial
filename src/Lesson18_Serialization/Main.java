package Lesson18_Serialization;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {

//    private static ArrayList<Profile> profiles = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Profile> profiles = (ArrayList<Profile>) deserData("Lesson18");
        System.out.println(profiles.size());
        Profile profile = new Profile();
        profile.setName(JOptionPane.showInputDialog(null, "Введите Ваше имя: "));
        profile.setSurname(JOptionPane.showInputDialog(null, "Введите Вашу фамилию: "));
        profiles.add(profile);
        for (Profile p: profiles) {
            System.out.println(p.getName() + " " + p.getSurname());
        }
        System.out.println(profiles.size());
        serData("Lesson18", profiles);
    }

    private static Object deserData(@SuppressWarnings("SameParameterValue") String file_name) {
        Object retObject = null;
        try {
            FileInputStream fileIn = new FileInputStream("res/" + file_name + ".txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            retObject = in.readObject();
            fileIn.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода.");
            System.exit(2);
        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден.");
            System.exit(3);
        }
        return retObject;
    }

    private static void serData(@SuppressWarnings("SameParameterValue") String file_name, Object obj) {
        try {
            FileOutputStream fileOut = new FileOutputStream("res/" + file_name + ".txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            fileOut.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода.");
            System.exit(2);
        }
    }
}
