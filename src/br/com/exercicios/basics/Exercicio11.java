package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a circle. Go to the editor
 * Test Data:
 * Radius = 7.5
 * Expected Output
 * Perimeter is = 47.12388980384689
 * Area is = 176.71458676442586
 */

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius = ");
        double r = sc.nextDouble();

        System.out.println("Perimeter is = " + (2 * 3.14 * r));
        System.out.println("Area is = " + (r * r * 3.14));
        sc.close();
    }
}
