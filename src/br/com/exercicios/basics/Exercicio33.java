package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program and compute the sum of the digits of an integer. Go to the editor
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = sc.nextInt();

        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
        sc.close();
    }
}
