package Projeto1;

public class File2
{
    private String nome;
    private int idade;
    private int peso;

    private String nomeFuncionario;
    private int salarioFuncionario;
    
    public File2()
    {
    }
    public File2(int idade, String nome, int peso, String nomeFuncionario, int salarioFuncionario)
    {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;

        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }
    public String getNome()
    {
        return nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public int getPeso()
    {
        return peso;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public void setPeso(int peso)
    {
        this.peso = peso;
    }


    public String getnomeFuncionario()
    {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario)
    {
        this.nomeFuncionario = nomeFuncionario;
    }
    public int getsalarioFuncionario()
    {
        return salarioFuncionario;
    }
    public void setsalarioFuncionario(int salarioFuncionario)
    {
        this.salarioFuncionario = salarioFuncionario;
    }
}