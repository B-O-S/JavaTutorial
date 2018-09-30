package Lesson17_Collections;

import java.util.ArrayList;
import java.util.Random;

public class Main {
//    private static String[][] mobiles = {
//            {"iPhone", "1234567"},
//            {"Nokia", "2345678"},
//            {"OnePlus", "3456789"}
//    };
//
//    public static void main(String[] args) {
//        for (int i = 0; i < mobiles.length; i++){
//            for (int k = 0; k < mobiles[i].length; k++){
//                System.out.println(mobiles[i][k] + " ");
//            }
//        }
//        System.out.println();
//    }
//*********************************************************************
//    private static Mobile[] mobiles = new Mobile[3];
//
//    public static void main(String[] args) {
//        mobiles[0] = new Mobile(1234567, "iPhone");
//        mobiles[1] = new Mobile(2345678, "Nokia");
//        mobiles[2] = new Mobile(3456789, "OnePlus");
//
//        for (Mobile m:mobiles) {
//            System.out.println(m.getNumber() + " " + m.getName());
//        }
//    }
//*********************************************************************
    private static ArrayList<Mobile> mobiles = new ArrayList<>();
    private static Random r = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            mobiles.add(new Mobile(r.nextInt(9999999), "OnePlus"));
        }
        for(Mobile m: mobiles){
            System.out.println(m.getNumber() + " " + m.getName());
        }
    }
}
