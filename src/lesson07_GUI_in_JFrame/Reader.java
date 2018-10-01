package lesson07_GUI_in_JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Reader extends JFrame {

    private JButton b1, b2;
    private JLabel l3, l4;
    private JTextField t1, t2;

    Reader(String s) {
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Очистить");
        b2 = new JButton("Посчитать");
        JLabel l1 = new JLabel("Введите первое число:");
        JLabel l2 = new JLabel("Введите второе число:");
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        JRadioButton rb1 = new JRadioButton("Log in Admin Panel");
        JRadioButtonMenuItem rbmi1 = new JRadioButtonMenuItem("Log in Admin Panel");
        add(b1);
        add(b2);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(l4);
        add(rb1);
        add(rbmi1);
        eHandler handler = new eHandler();
        b1.addActionListener(handler);
        b2.addActionListener(handler);

    }
    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == b2) {
                    int i = Integer.parseInt(t1.getText());
                    int k = Integer.parseInt(t2.getText());
                    i++;
                    k++;
                    String a = "Ваше первое число теперь равно " + i;
                    String b = "Ваше второе число теперь равно " + k;
                    l3.setText(a);
                    l4.setText(b);

                }
                if (e.getSource() == b1) {
                    t1.setText("");
                    t2.setText("");
                    l3.setText("");
                    l4.setText("");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите в поле число");
            }
        }
    }
}
