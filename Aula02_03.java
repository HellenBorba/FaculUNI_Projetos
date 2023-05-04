import javax.swing.JOptionPane;

public class Aula02_03
{
    public static void main(String[] args)
    {
        String A = JOptionPane.showInputDialog("Digite um número: ");
        int B = Integer.parseInt(A);
        int C = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

        int D = B + C;

        JOptionPane.showMessageDialog(null, D, "A soma é: ", 0);
    }
}


