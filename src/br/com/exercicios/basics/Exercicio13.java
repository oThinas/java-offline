package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle. Go to the editor
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 * Expected Output
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        System.out.println("Width = " + n1 + " Height = " + n2);
        System.out.println("\nArea is " + n1 + " * " + n2 + " = " + (n1 * n2));
        System.out.println("Perimeter is 2 * (" + n1 + " + " + n2 + ") = " + (2 * (n1 + n2)));
        sc.close();
    }
}
