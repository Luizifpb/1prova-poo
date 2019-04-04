package br.edu.ifpb.poo;

public class Retangulo extends Quadrado {
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Retangulo de lado: " + this.getLado() + " Retangulo de altura: " + this.getAltura();
    }

    @Override
    public double area(){
        return this.getLado()*this.getAltura();
    }
}
