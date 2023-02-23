import javax.swing.JOptionPane;
public class NumeroLetras
{
    public static void main(String[] args)
    {
        // Declaracion de variables
        int n;
        String rta = "";
                
        // Input
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el dígito: "));
        
        // Processing
        switch(n)
        {
            case 0: 
                rta = " CERO ";
                break;
            case 1:
                rta = " UNO ";
                break;
            case 2:
                rta = " DOS ";
                break;
            case 3: 
                rta = " TRES ";
                break;
            case 4:
                rta = " CUATRO ";
                break;
            case 5:
                rta = " CINCO ";
                break;
            case 6: 
                rta = " SEIS ";
                break;
            case 7:
                rta = " SIETE ";
                break;
            case 8:
                rta = " OCHO ";
                break;
            case 9: 
                rta = " NUEVE ";
            default:
                rta = " NO ES UN DÍGITO ";
        }
        
        // Output
        JOptionPane.showMessageDialog(null,rta);
        
        // End
        System.exit(0);
      
    }
    
}
