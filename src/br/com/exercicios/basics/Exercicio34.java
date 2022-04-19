package br.com.exercicios.basics;

import java.util.Scanner;

/**
 * Write a Java program to compute the area of a hexagon. Go to the editor
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
 */
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double lado = sc.nextDouble();
        final double VALOR_PI = 3.14;

        double area = (6 * lado * lado) / (4 * Math.tan(VALOR_PI / 6));
        System.out.println("The area of the hexagon is: " + area);

        sc.close();
    }
}
