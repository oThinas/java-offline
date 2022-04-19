package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number. Go to the editor
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101 
 */
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = sc.nextInt();
        String binario = Integer.toBinaryString(decimal);
        System.out.println("Binary number is: " + binario);

        sc.close();
    }
}
