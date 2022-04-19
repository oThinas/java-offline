package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a binary number to a Octal number. Go to the editor
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7 
 */
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binario = sc.nextLine();
        int decimal = Integer.parseInt(binario, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal number: " + octal.toUpperCase());
        sc.close();
    }
}
