import javax.swing.JOptionPane;

public class Calorías
{
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null, "Tu programa: Contador de Calorías");

        int[] calorias;
        String[] Dia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        calorias = new int[7];

        for (int i = 0; i < calorias.length; i++)
        {
            calorias[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de calorias para el dia " + Dia[i] + ": ", "CONTEO DE CALORIAS"));
        }

        for(int j = 0; j < calorias.length; j++)
        {
            JOptionPane.showMessageDialog(null, "El numero de calorias para el dia " + Dia[j] + ": " + calorias[j]);

        }
    }
}