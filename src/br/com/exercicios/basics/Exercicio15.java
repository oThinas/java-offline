package br.com.exercicios.basics;

/**
 * Write a Java program to swap two variables
 */
public class Exercicio15 {
    public static void main(String[] args) {
        int n1, n2, aux;
        n1 = 10;
        n2 = 5;
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        System.out.println("Trocando...");

        aux = n1;
        n1 = n2;
        n2 = aux;

        System.out.println("Trocando...");
        System.out.println("n1 = " + n1 + " n2 = " + n2);
    }
}
