package lesson33_Swing_part_08_Model;

import java.awt.*;
import javax.swing.*;

class MainWindow extends JFrame {

    MainWindow() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Oleg Bura
        scrollPane1 = new JScrollPane();
        list1 = new JList();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {15, 225, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {15, 417, 10, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }
        contentPane.add(scrollPane1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Oleg Bura
    private JScrollPane scrollPane1;
    private JList list1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
