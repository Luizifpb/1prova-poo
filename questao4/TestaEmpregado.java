package br.edu.ifpb.poo;

public class TestaEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        Diretor diretor = new Diretor("jose", 24, 3000, 128);

        System.out.println(empregado.toString());
        System.out.println(diretor.toString());
    }
}
