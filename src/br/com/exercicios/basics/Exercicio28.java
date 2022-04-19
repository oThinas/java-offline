package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a hexadecimal to a decimal number. Go to the editor
Input Data:
Input a hexadecimal number: 25
Expected Output

Equivalent decimal number is: 37
 */
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any hexadecimal number: ");
        String hex = sc.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Equivalent decimal number: " + decimal);
        sc.close();
    }
}
