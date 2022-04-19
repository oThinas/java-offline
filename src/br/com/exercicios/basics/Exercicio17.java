package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers. Go to the editor
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output
 *
 * Sum of two binary numbers: 101
 */

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String binario1 = sc.next();
        int decimal1 = Integer.parseInt(binario1, 2); //Converte um numero binario na String para int

        System.out.print("Input second binary number: ");
        String binario2 = sc.next();
        int decimal2 = Integer.parseInt(binario2, 2);

        int aux = decimal1 + decimal2;
        String binarioResultado = Integer.toBinaryString(aux); //Converte um numero int para binario na String
        System.out.println("Sum of two binary numbers: " + binarioResultado);
        
        sc.close();
    }
}
