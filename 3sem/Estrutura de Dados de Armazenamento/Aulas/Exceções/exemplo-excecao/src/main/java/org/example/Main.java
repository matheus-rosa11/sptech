package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String sNum1 = JOptionPane.showInputDialog("Digite um número");
        String sNum2 = JOptionPane.showInputDialog("Digite um número");

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        JOptionPane.showMessageDialog(null, String.format("A soma dá %d", num1 + num2));
    }
}