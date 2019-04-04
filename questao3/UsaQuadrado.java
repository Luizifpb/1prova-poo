package br.edu.ifpb.poo;

public class UsaQuadrado {
    public static double area_figura(Quadrado x){
        return  x.area();
    }

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(4);

        Retangulo retangulo = new Retangulo();
        retangulo.setLado(4);
        retangulo.setAltura(8);

        System.out.println(quadrado.toString());
        System.out.println(retangulo.toString());

        System.out.println("Area do quadrado: " + area_figura(quadrado));
        System.out.println("Area do retangulo: " + area_figura(retangulo));
    }
}
