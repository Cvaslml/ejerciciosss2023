package CostoLlamada.ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        /// Variables
        double t = 0, costo = 300;
        

        /// Entrada de Datos
        t = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tiempo de duración de la llamada (en min): "));

        /// Input
        if(t > 3)
            costo = costo + ((t-3) * 50);

        // Output
        JOptionPane.showMessageDialog(null,"El costo de su llamada fue de: $" + costo);

        // End
        System.exit(0);
    }
}
