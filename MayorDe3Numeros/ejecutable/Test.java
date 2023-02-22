package MayorDe3Numeros.ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        /// Variables
        int x, y, z;
        String msj;

        /// Entrada de Datos
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        z = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número: "));

        /// Input
        if (x > y) {
            if (x > z) {
                msj = ("El número mayor es: " + x);                                             
            } else {
                msj = ("el número mayor es: " + z);     
            }
        } else if (y > z) {
            msj = ("el número mayor es: " + y);
        } else {
            msj = ("el número mayor es: " + z);
        }

        /// Output
        JOptionPane.showMessageDialog(null,msj);

        // End
        System.exit(0);
    }
}

