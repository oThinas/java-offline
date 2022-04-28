package br.com.fiap.abstrato;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int op = 0;
        double perimetro = 0;
        double area = 0;
        do {
            System.out.println("Calcular área de (1 - Quadrado) ou (2 - Triângulo)?");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    PoligonoRegular quad = new Quadrado();
                    quad.setNumLados(4);
                    System.out.print("Infome o tamanho dos lados: ");
                    quad.setTamLado(sc.nextDouble());
                    perimetro = quad.calcularPerimetro();
                    area = quad.calcularArea();
                    break;
                case 2:
                    PoligonoRegular tr = new Triangulo();
                    tr.setNumLados(3);
                    System.out.print("Informe o tamanho dos lados: ");
                    tr.setTamLado(sc.nextDouble());
                    perimetro = tr.calcularPerimetro();
                    area = tr.calcularArea();
                    break;
                default:
                    System.out.println("Digite somente 1 ou 2! (1 - Quadrado) ou (2 - Triângulo)");
                    break;
            }
        } while (op != 1 && op != 2);
        System.out.println("Perímetro = " + df.format(perimetro) +
                            "\nÁrea = " + df.format(area));
        sc.close();
    }
}
