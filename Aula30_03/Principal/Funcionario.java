package Principal;

import javax.swing.JOptionPane;

import Projeto1.File2;

public class Funcionario
{
    public static void main(String[] args)
    {
        File2 objeto1 = new File2();

        objeto1.setNomeFuncionario("Bryan");
        objeto1.setsalarioFuncionario(1200);

        JOptionPane.showMessageDialog(null, "Nome do funcionário: " + objeto1.getnomeFuncionario());
        JOptionPane.showMessageDialog(null, "Salário do funcionário: " + objeto1.getsalarioFuncionario());
    }
}