package Lesson11_Read_File;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.File;

public class Main {
    private static String[][] m = new String[5][3];
    private static Scanner scn;

    public static void main(String args[]) {
        openFile();
        readFile();
        out();
    }

    private static void out() {
//        for (int row = 0; row < m.length; row++) {
//            for (int col = 0; col < m[row].length; col++) {
//                System.out.print(m[row][col] + "   ");
//            }
//            System.out.println();
//        }
        for (String[] aM : m) {
            for (String anAM : aM) {
                System.out.print(anAM + "   ");
            }
            System.out.println();
        }
    }

    private static void readFile() {
        while (scn.hasNext()){
            for (int row = 0; row < m.length; row++) {
                for (int col = 0; col < m[row].length; col++) {
                    m[row][col] = scn.next();
                }
            }
        }
    }

    private static void openFile() {
        try {
            scn = new Scanner(new File("res//Lesson11.txt"));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }
    }
}
