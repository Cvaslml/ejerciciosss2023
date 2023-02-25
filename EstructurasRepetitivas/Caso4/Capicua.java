package Caso4;

import javax.swing.JOptionPane;

public class Capicua {

    public static void main(String[] args) {
        // Variables
        int n, aux, inverso = 0, cifra;

        // Input
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));                                                
        } while (n < 10);
       
        //Proccesing
        // Voltea el #
        aux = n;

        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        // Output
    
        if(n == inverso){
            JOptionPane.showMessageDialog(null,"El número es capicua");
        }else{
            JOptionPane.showMessageDialog(null,"No es un número capicua");
        }

        // End
        System.exit(0);
    } 
}