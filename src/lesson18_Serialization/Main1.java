package lesson18_Serialization;

import javax.swing.*;
import java.util.ArrayList;
import com.github.cvazer.serializer.Serializer;

public class Main1 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Serializer<ArrayList<Profile>> serializer = new Serializer<>("res/Lesson18.txt");
        ArrayList<Profile> profiles = serializer.deserialize();
        System.out.println(profiles.size());
        Profile profile = new Profile();
        profile.setName(JOptionPane.showInputDialog(null, "Введите Ваше имя: "));
        profile.setSurname(JOptionPane.showInputDialog(null, "Введите Вашу фамилию: "));
        profiles.add(profile);
        for (Profile p : profiles) {
            System.out.println(p.getName() + " " + p.getSurname());
        }
        System.out.println(profiles.size());
        serializer.serialize(profiles);
    }
}
