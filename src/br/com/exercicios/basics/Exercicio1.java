package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
 * Expected Output :
 * Hello
 * Alexandra Abramov
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Hello \n" + nome);
        sc.close();
    }
}
