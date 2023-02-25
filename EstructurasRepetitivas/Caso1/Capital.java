package Caso1;

import javax.swing.JOptionPane;

public class Capital
{
    public static void main(String[] args) 
    {
        // Variable
        int c1, c2, c3, meses;

        //Input
        c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad: "));
        c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad: "));
        c3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad: "));

        // Processing
        meses = 0;
        while (c1 + c2 < c3) {
            c1 += (c1 * 0.03);
            c2 += (c2 * 0.04);
            meses++;
        }

        // Output
        JOptionPane.showMessageDialog(null,"Para alcanzar el capital deseado de " + c3 + " pesos, se tardarían un total de " + meses + " meses.");
        
        // End
        System.exit(0);
    }
}
