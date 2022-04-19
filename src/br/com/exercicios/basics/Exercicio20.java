package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to hexadecimal number. Go to the editor
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F 
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = sc.nextInt();
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal number is: " + hex.toUpperCase());

        sc.close();
    }
}
