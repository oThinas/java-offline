package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a hexadecimal to a binary number. Go to the editor
Input Data:
Enter Hexadecimal Number : 37
Expected Output

Equivalent Binary Number is: 110111
 */
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any hexadecimal number: ");
        String hex = sc.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        String binario = Integer.toBinaryString(decimal);
        System.out.println("Equivalent binary number: " + binario.toUpperCase());
        sc.close();
    }
}
