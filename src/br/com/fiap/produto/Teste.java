package br.com.fiap.produto;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        CarrinhoCompra car = new CarrinhoCompra();
        String op = "";
        String item = "";
        do {
            do {
            System.out.println("Deseja comprar um DVD ou CD?");
            item = sc.next().toUpperCase();
            System.out.println("-----------------------------");
                if (item.equals("DVD")) {
                    Dvd dvd1 = new Dvd();
                    System.out.println("Insira os dados do DVD:");
                    System.out.print("ID: ");
                    dvd1.setId(sc.nextInt());
                    System.out.print("Descrição: ");
                    dvd1.setDescricao(sc1.nextLine());
                    System.out.print("Preço: ");
                    dvd1.setPreco(sc.nextDouble());
                    System.out.print("Quantidade: ");
                    dvd1.setQuantidade(sc.nextInt());
                    System.out.print("Diretor: ");
                    dvd1.setDiretor(sc1.nextLine());
                    System.out.print("Ano de lançamento: ");
                    dvd1.setAnoLancamento(sc.nextInt());
                    System.out.println("-----------------------------");
    
                    car.adicionar(dvd1);
    
                } else if (item.equals("CD")) {
                    Cd cd1 = new Cd();
                    System.out.println("Insira os dados do CD:");
                    System.out.print("ID: ");
                    cd1.setId(sc.nextInt());
                    System.out.print("Descrição: ");
                    cd1.setDescricao(sc1.nextLine());
                    System.out.print("Preço: ");
                    cd1.setPreco(sc.nextDouble());
                    System.out.print("Quantidade: ");
                    cd1.setQuantidade(sc.nextInt());
                    System.out.print("Artista: ");
                    cd1.setArtista(sc1.nextLine());
                    System.out.print("Gênero: ");
                    cd1.setGenero(sc1.nextLine());
                    System.out.println("-----------------------------");
    
                    car.adicionar(cd1);
                } else {
                    System.out.println("Opção inválida!");
                }
            } while (!item.equals("DVD") && !item.equals("CD"));

            System.out.println("Deseja realizar outra compra?");
            op = sc.next().toUpperCase();

        } while (op.equals("SIM"));

        System.out.println("-----------------------------");
        System.out.println("Preço: R$" + car.finalizarCompra());
        sc.close();
        sc1.close();
    }
}
