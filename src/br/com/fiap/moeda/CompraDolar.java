package br.com.fiap.moeda;

import java.util.Scanner;

public class CompraDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Moeda moeda = new Moeda();
        System.out.print("Informe o valor em reais: ");
        moeda.setValorReal(sc.nextDouble());
        System.out.print("Informe a cotação atual do dólar: ");
        moeda.setCotacaoDolar(sc.nextDouble());

        moeda.calcularConversao();
        System.out.println("Você poderá comprar " + moeda.getQuantidadeDolar() + " dólares");
        sc.close();
    }
}
