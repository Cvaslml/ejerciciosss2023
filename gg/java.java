import javax.swing.JOptionPane;

public class java {
    public static void main(String[] args) {
        // Variable
        int cp = 0, ci = 0, n, N;

        // Input

        // Processing
        N = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa N: "));

        for(int i=1; i<=N; i++){
            n = (int) (Math.random()*20+1);
            if (n%2==0){
                cp++;
            }
            else 
            {
                ci++;
            }
        }

        JOptionPane.showMessageDialog(null, "El número cp es: " + cp);
        JOptionPane.showMessageDialog(null, "El número ci es: " + ci);
    }
}
