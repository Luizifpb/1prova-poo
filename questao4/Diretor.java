package br.edu.ifpb.poo;

public class Diretor extends Empregado {
    private double gratificação;
    // Construtor com parâmetros
    public Diretor( String nome, int idade, double salário, double gratificação) {
        super(nome, idade, salário);
        this.gratificação = gratificação;
    }

    public String toString() {
        return super.toString() + " gratificação" + this.gratificação;
    }
}
