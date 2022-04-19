package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to octal number. Go to the editor
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17  
 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int decimal = sc.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal number is: " + octal);
        sc.close();
    }
}
