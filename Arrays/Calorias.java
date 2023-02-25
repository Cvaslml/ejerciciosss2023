import javax.swing.JOptionPane;

public class Calorias{
    public static void main(String[] args) {
        // Variable
        int[] calorias;
        int n;

        calorias= new int[6];

        for (int i=0; i < calorias.length; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor de calorias día*día: "));
            calorias[i] = n;
        }
        JOptionPane.showMessageDialog(null, "Calorías:" + "\nDía Lunes: " + calorias[0] + "Día Martes" + calorias[1] + "Día Miércoles: " + calorias[2] + "Día Jueves" + calorias[3] + "Día Viernes" + calorias[4] + "Día Sabado: " + calorias[5] + "Día Domingo:" + calorias[6]);
    }
}