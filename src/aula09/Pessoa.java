package aula09;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    //Métodos especiais
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo(String sexo){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    //Métodos
    public void fazerAniversario(){
        this.idade += 1;
    }
    public void apresentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
}
