package Ecuacion2doGrado.ejecutable;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
    
        /// Variables
        double a, b, c; /* a=2 b=5 c=-7 */
        double x1, x2;

        /// Entrada de Datos
        a = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de c: "));

        /// Input - Output
        if (Math.pow(b, 2) - (4 * a * c) >= 0){

        x1 = (((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
        x2 = (((-b) - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a));
        JOptionPane.showMessageDialog(null,"Su resultado positivo es: " + x1 + " y su resultado negativo es: " + x2);
        
        }else JOptionPane.showMessageDialog(null, "Por el momento no puedo solucionarlo: Son soluciones Complejas");

        // End
        System.exit(0);
    }
}
