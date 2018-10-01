package lesson12_Formatter;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        try {
            Formatter x = new Formatter("res//Lesson12.txt");
            Scanner scn = new Scanner(System.in);
            System.out.println("Сколько Вам лет?");
            int a = (int) Double.parseDouble(scn.next());
            System.out.println("Как Вас зовут?");
            String b = scn.next();
            System.out.println("Где Вы живете?");
            String c = scn.next();
            x.format("Меня зовут %s, мне %d лет, я живу в городе %s", b, a, c);
            x.close();
        } catch(Exception ignored) {}
    }

}
