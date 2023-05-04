package PessoaExer;

public class Pessoa1 
{
    private int id;
    private String nome;
    private int idade;

    public Pessoa1()
    {
    }
    public Pessoa1(int id, String nome, int idade)
    {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getd()
    {
        return id;
    }
    public String getNome()
    {
        return nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }


    public void FazerNiver()
    {
        this.idade ++;
    }

    public void Dados()
    {
        System.out.print("ID: " + this.id);
        System.out.print("Nome:" + this.nome);
        System.out.print("Idade: " + this.idade);
    }
}
