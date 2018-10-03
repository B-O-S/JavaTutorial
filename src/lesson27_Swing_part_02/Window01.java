package lesson27_Swing_part_02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window01 {
    private JTabbedPane TabbedPane01;
    private JButton button1;

    public Window01() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window01");
        frame.setContentPane(new Window01().TabbedPane01);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
