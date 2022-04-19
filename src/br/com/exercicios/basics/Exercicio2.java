package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to print the sum of two numbers. Go to the editor
 * Test Data:
 * 74 + 36
 * Expected Output :
 * 110
 */

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 + n2);
        sc.close();
    }
}
