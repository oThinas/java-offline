package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a octal number to a decimal number. Go to the editor
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8
 */
public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String octal = sc.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Equivalent decimal number: " + decimal);
        sc.close();
    }
}
