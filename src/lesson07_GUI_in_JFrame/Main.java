package lesson07_GUI_in_JFrame;

import javax.swing.*;
public class Main {
    public static void main(String args[]) {
        Reader r = new Reader("G-гурда");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(300, 200);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }
    private static int count(int x) {
        x = x + 1;
        return x;
    }
}
