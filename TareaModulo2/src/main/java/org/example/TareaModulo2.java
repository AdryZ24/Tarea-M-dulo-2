package org.example;

import javax.swing.*;

public class TareaModulo2 {
    private JComboBox comboBox1;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton cancelarButton;
    private JFormattedTextField nombreFormattedTextField;
    private JFormattedTextField emailFormattedTextField;
    private JFormattedTextField formattedTextField1;
    private JCheckBox activoCheckBox;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JFormattedTextField notasFormattedTextField;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TareaModulo2");
        frame.setContentPane(new TareaModulo2().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

