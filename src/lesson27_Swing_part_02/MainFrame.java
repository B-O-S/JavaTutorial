package lesson27_Swing_part_02;

import javax.swing.*;

class MainFrame extends JFrame {

    MainFrame() {
        PanelMain main = new PanelMain();
        add(main);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(true);
        setLocationRelativeTo(null);
    }
}
