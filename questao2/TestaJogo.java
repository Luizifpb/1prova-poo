package br.edu.ifpb.poo;

public class TestaJogo {
    public static void main(String[] args) {
        JogoNumSecreto jogo = new JogoNumSecreto();
        jogo.gera_num_aleatorio();
        jogo.jogo();
    }
}
