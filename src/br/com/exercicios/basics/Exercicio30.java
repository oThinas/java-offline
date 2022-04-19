package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a hexadecimal to a octal number. Go to the editor
Input Data:
Input a hexadecimal number: 40
Expected Output

Equivalent of octal number is: 100 
 */
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any hexadecimal number: ");
        String hex = sc.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Equivalent octal number: " + octal.toUpperCase());
        sc.close();
    }
}
