package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
 */

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println((n1 + n2 + n3) / 3);
        sc.close();
    }
}
