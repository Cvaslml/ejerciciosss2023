package Caso2;

import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {

        // Variable
        int n;
        double factorial;

        // Input
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        // Processing
        factorial = 1;

        for (int i=n;i>0;i--) {
            factorial=factorial*i;
        }

        // Output
        JOptionPane.showMessageDialog(null,"El factorial de " + n + " es igual a: " + factorial);

        // End
        System.exit(0);
    }
}
