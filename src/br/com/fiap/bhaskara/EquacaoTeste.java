package br.com.fiap.bhaskara;

import java.util.Scanner;

public class EquacaoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Equacao eq = new Equacao(4, 1, 4);
//        Equacao eq = new Equacao(1, 2, -3);
        Equacao eq = new Equacao();
        eq.a = sc.nextInt();
        eq.b = sc.nextInt();
        eq.c = sc.nextInt();

        eq.calcDelta();
        System.out.println(eq.raiz());
        sc.close();
    }
}
