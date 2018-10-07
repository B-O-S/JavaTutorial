/*
 * Created by JFormDesigner on Thu Oct 04 20:03:01 EEST 2018
 */

package lesson28_Swing_part_03;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author Oleg Bura
 */
class MainForm extends JFrame {
    MainForm(int width, int height) {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        try {
            Main.setImage(new URL(textArea1.getText()));
        } catch (Exception e1) {
//            e1.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid URL or no Internet connection.");
        }
    }

    private void button3ActionPerformed(ActionEvent e) {
        if (Main.getImage() == null) {
            JOptionPane.showMessageDialog(null, "No images loaded.");
            return;
        }
        imageLabel.setIcon(new ImageIcon(Main.getImage()));
        imageLabel.updateUI();

    }

    private void menuItem3ActionPerformed(ActionEvent e) {
        System.exit(0);
//        String readerNames[] = ImageIO.getReaderFormatNames();
//        System.out.println(Arrays.toString(readerNames));
//        String writerNames[] = ImageIO.getWriterFormatNames();
//        System.out.println(Arrays.toString(writerNames));
    }

    private void button2ActionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        int replay = chooser.showOpenDialog(null);
        if (replay == JFileChooser.APPROVE_OPTION) {
            Main.setImage(chooser.getSelectedFile());
        }

    }

    private void menuItem2ActionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        int replay = chooser.showSaveDialog(null);
        if (replay == JFileChooser.APPROVE_OPTION) {
            Main.saveImage(chooser.getSelectedFile(), comboBox1.getItemAt(comboBox1.getSelectedIndex()));
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Oleg Bura
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem2 = new JMenuItem();
        menu2 = new JMenu();
        menuItem3 = new JMenuItem();
        tabbedPane1 = new JTabbedPane();
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        panel2 = new JPanel();
        button3 = new JButton();
        label2 = new JLabel();
        comboBox1 = new JComboBox<>();
        scrollPane2 = new JScrollPane();
        imageLabel = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 85, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("File");

                //---- menuItem2 ----
                menuItem2.setText("Save Image");
                menuItem2.addActionListener(this::menuItem2ActionPerformed);
                menu1.add(menuItem2);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Options");

                //---- menuItem3 ----
                menuItem3.setText("Exit Programm");
                menuItem3.addActionListener(this::menuItem3ActionPerformed);
                menu2.add(menuItem3);
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        //======== tabbedPane1 ========
        {

            //======== panel1 ========
            {

                // JFormDesigner evaluation mark
//                panel1.setBorder(new javax.swing.border.CompoundBorder(
//                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
//                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
//                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
//                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

                panel1.setLayout(new GridBagLayout());
                ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {15, 75, 105, 227, 105, 10, 0};
                ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {15, 27, 21, 197, 5, 0};
                ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 1.0E-4};

                //---- button1 ----
                button1.setText("Get Image");
                button1.addActionListener(this::button1ActionPerformed);
                panel1.add(button1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button2 ----
                button2.setText("Select Image");
                button2.addActionListener(this::button2ActionPerformed);
                panel1.add(button2, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- label1 ----
                label1.setText("Enter URL here:");
                panel1.add(label1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportBorder(new EmptyBorder(5, 5, 5, 5));

                    //---- textArea1 ----
                    textArea1.setText("Enter URL here\u2026");
                    scrollPane1.setViewportView(textArea1);
                }
                panel1.add(scrollPane1, new GridBagConstraints(1, 3, 4, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            }
            tabbedPane1.addTab("Adding Image", panel1);

            //======== panel2 ========
            {
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {15, 93, 105, 0, 0, 105, 8, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {15, 0, 21, 0, 5, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0, 0.0, 1.0E-4};

                //---- button3 ----
                button3.setText("View");
                button3.addActionListener(this::button3ActionPerformed);
                panel2.add(button3, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- label2 ----
                label2.setText("Save As");
                panel2.add(label2, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                    "jpeg",
                    "jpg",
                    "png",
                    "gif",
                    "tif",
                    "tiff",
                    "bmp",
                    "wbmp"
                }));
                panel2.add(comboBox1, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(imageLabel);
                }
                panel2.add(scrollPane2, new GridBagConstraints(1, 3, 5, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
            }
            tabbedPane1.addTab("Viewing Image", panel2);
        }
        contentPane.add(tabbedPane1, new GridBagConstraints(0, 0, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Oleg Bura
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem2;
    private JMenu menu2;
    private JMenuItem menuItem3;
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JPanel panel2;
    private JButton button3;
    private JLabel label2;
    private JComboBox<String> comboBox1;
    private JScrollPane scrollPane2;
    private JLabel imageLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
