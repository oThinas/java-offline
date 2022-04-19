package br.com.exercicios.figura;

public class Teste {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();

        quadrado.setCor("Roxo");
        quadrado.setLado1(4);

        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(retangulo);
        System.out.println(circulo);
    }
}
