package Principal;

import javax.swing.JOptionPane;

import Projeto1.File2;

public class Aluno
{
    public static void main(String[] args) 
    {
        File2 objeto = new File2();
        
        objeto.setNome("Maria");
        objeto.setIdade(18);
        objeto.setPeso(50);
        
        JOptionPane.showMessageDialog(null, "Nome do aluno: " + objeto.getNome());
        JOptionPane.showMessageDialog(null, "Idade do aluno: " + objeto.getIdade());
        JOptionPane.showMessageDialog(null, "Peso do aluno: " + objeto.getPeso());
    }
}