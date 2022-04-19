package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output :
 * 25 x 5 = 125
 */

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 * n2);
        sc.close();
    }
}
