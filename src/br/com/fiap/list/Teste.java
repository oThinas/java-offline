package br.com.fiap.list;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Comodo co = new Comodo();
        Casa ca = new Casa();
        Scanner sc = new Scanner(System.in);
        String op;

        do {
            System.out.print("Digite o nome do cômodo: ");
            co.setNome(sc.next());
            System.out.print("Digite a altura do cômodo: ");
            co.setAltura(sc.nextDouble());
            System.out.print("Digite a largura do cômodo: ");
            co.setLargura(sc.nextDouble());
            co.areaComodo();
            ca.setAreaTotal(co.getArea());
            
            System.out.println("Deseja incluir um novo cômodo: ");
            op = sc.next().toUpperCase();

        }while (op.equals("SIM"));
        sc.close();
        System.out.println("Área total: " + ca.getAreaTotal());
    }
}