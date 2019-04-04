package br.edu.ifpb.poo;
import java.util.Scanner;
import java.util.Random;
public class JogoNumSecreto {
    private Random r = new Random();
    private Scanner scan = new Scanner(System.in);
    private int k;

    public void gera_num_aleatorio(){
        this.k = r.nextInt(7);
        while (this.k==0){
            this.k = r.nextInt(7);
        }
    }

    public void jogo(){
        this.gera_num_aleatorio();
        System.out.println("Bem vindo ao jogo número secreto, você tem 3 tentativas para tentar acertar o número.");
        for (int i=2;i>-1;i--) {
            int user_num = this.scan.nextInt();
            if (user_num == this.k){
                System.out.println("Parabéns voce acertou o número secreto!!!");
                break;
            }
            else{
                System.out.println("Restam " + i +" tentativas");
            }
        }
    }


}
