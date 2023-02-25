package Caso3;

import javax.swing.JOptionPane;
 
public class NumeroPrimo
{
    public static void main(String[] args)
    {
        // Variables
        int contador,I,numero;

        // Input
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: ")); 

        // Processing
        contador = 0;
        for(I = 1; I <= numero; I++)
        {
            if((numero % I) == 0)
            {
                contador++;
            }
        }

        // Output
        
        if(contador == 2)
        {
            JOptionPane.showMessageDialog(null, "El numero es primo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero no es primo");
        }

        // End
        System.exit(0);
    }
}

