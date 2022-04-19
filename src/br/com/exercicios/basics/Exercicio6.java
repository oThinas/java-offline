package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
        sc.close();
    }
}
