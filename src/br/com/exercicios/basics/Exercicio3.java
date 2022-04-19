package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to divide two numbers and print on the screen. Go to the editor
 * Test Data :
 * 50/3
 * Expected Output :
 * 16
 */

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 / n2);
        sc.close();
    }
}
