package br.com.fiap;

import java.util.Scanner;

public class ExercicioIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe seu peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Informe sua altura (m): ");
        double altura = sc.nextDouble();

        peso = peso / (altura * altura);

        if (peso >= 18.5 && peso <= 25) {
            System.out.println("Você está dentro do seu peso normal: " + peso);
        } else {
            System.out.println("Você está fora do seu peso normal: " + peso);
        }
        sc.close();
    }
}
