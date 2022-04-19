package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a octal number to a hexadecimal number. Go to the editor
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40
 */
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String octal = sc.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal);
        System.out.println("Equivalent hexadecimal number: " + hex.toUpperCase());
        sc.close();
    }
}
