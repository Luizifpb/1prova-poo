package br.edu.ifpb.poo;

public class Empregado {
    private String nome;
    private int idade;
    private double salário;

    // construtor default
     public Empregado(){
        this.nome = "sem-nome";
        this.idade = 0;
        this.salário = 0.0;
    }

    // construtor com parâmetros
    public Empregado (String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salário = salario;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salário=" + salário;
    }
}
