package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to convert a binary number to hexadecimal number. Go to the editor
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D
 */
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binario = sc.nextLine();
        int decimal = Integer.parseInt(binario, 2);
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal value: " + hex.toUpperCase());
        sc.close();
    }
}
