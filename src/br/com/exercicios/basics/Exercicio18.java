package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to multiply two binary numbers. Go to the editor
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110 
 */

public class Exercicio18 {
    public static void main(String[] args) {
        //Instância do Scanner, apresentação e coleta de dados do usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String binario1 = sc.nextLine();
        System.out.print("Input second binary number: ");
        String binario2 = sc.nextLine();

        //Conversão dos números binários para decimal
        int decimal1 = Integer.parseInt(binario1, 2);
        int decimal2 = Integer.parseInt(binario2, 2);
        
        //Multplicação decimal dos números convertidos
        int aux = decimal1 * decimal2;

        //Conversão do resultado decimal para binário e impressão pro usuário
        String binarioResultado = Integer.toBinaryString(aux);
        System.out.println("Multiplication of two binary numbers: " + binarioResultado);

        sc.close();
    }
}
