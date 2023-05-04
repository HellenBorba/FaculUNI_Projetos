package Principal;
import PessoaExer.Pessoa1;

import javax.swing.JOptionPane;

public class File2
{
    public static void main (String[] args)
    {
        Pessoa1 objeto = new Pessoa1();

        objeto.setId(0);
        objeto.setIdade(10);
        objeto.setNome("Hellen");

        JOptionPane.showMessageDialog(null, "Nome da pessoa: " + objeto.getNome());
        JOptionPane.showMessageDialog(null, "Idade da pessoa: " + objeto.getIdade());
        JOptionPane.showMessageDialog(null, "id da pessoa: " + objeto.getd());
    }
}