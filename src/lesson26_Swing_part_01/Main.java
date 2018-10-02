package lesson26_Swing_part_01;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Okno okno = new Okno();
        okno.setVisible(true);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(300, 200);
        okno.setResizable(true);
        okno.setLocationRelativeTo(null);
        JScrollPane scrPane = new JScrollPane();
        scrPane.setBounds(100, 100, 100, 100);
        okno.setLayout(null);
        okno.add(scrPane);
        JTextArea textArea = new JTextArea();
        textArea.setText("fdgsfdgdhgdsfdsdfsdsh.,mhfgjl,.hdgfk,sdnm,gdf,gdf,sndsngj,fdhnjktdghskdjhgfjydkghsdgdfskgldfsghdslfghjfsldhgjfldshdfjlksdfskl");
        scrPane.setViewportView(textArea);
    }
}
