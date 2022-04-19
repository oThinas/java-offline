package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a octal number to a binary number. Go to the editor
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111 
 */
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String octal = sc.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        String binario = Integer.toBinaryString(decimal);
        System.out.println("Equivalent binary number: " + binario);

        // System.out.println("Equivalente binary number: " + Integer.toBinaryString(Integer.parseInt(sc.nextLine(), 8)));
        sc.close();
    }
}
