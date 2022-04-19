package br.com.exercicios.basics;

import java.util.Scanner;
/**
 * Write a Java program to convert a binary number to decimal number. Go to the editor
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4 
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binario = sc.nextLine();
        int decimal = Integer.parseInt(binario, 2);
        System.out.println("Decimal number: " + decimal);
        sc.close();
    }
}
