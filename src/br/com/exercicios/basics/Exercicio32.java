package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39
 */
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int n1 = sc.nextInt();
        System.out.print("Input second integer: ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println(n1 + " = " + n2);
            System.out.println(n1 + " > " + n2);
            System.out.println(n1 + " >= " + n2);
            System.out.println(n1 + " < " + n2);
            System.out.println(n1 + " <= " + n2);
        } else if (n1 > n2) {
            System.out.println(n1 + " != " + n2);
            System.out.println(n1 + " > " + n2);
            System.out.println(n1 + " >= " + n2);
        } else {
            System.out.println(n1 + " != " + n2);
            System.out.println(n1 + " < " + n2);
            System.out.println(n1 + " <= " + n2);
        }

        sc.close();
    }
}
