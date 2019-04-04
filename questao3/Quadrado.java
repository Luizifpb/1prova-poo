package br.edu.ifpb.poo;

public class Quadrado {
    private double lado;
    public double getLado(){ return this.lado; }
    public void setLado(double l){ this.lado = l; }
    public String toString(){ return "Quadrado de lado: " + this.lado; }
    public double area(){ return this.lado * this.lado; }
}
