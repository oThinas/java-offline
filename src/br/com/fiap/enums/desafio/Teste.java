package br.com.fiap.enums.desafio;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Feriado f = new Feriado();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int op = 0;
        do {
            System.out.println("Digite o tipo de feriado: " +
            "\n1 - Nacional" +
                            "\n2 - Estadual" +
                            "\n3 - Municipal");
            op = sc.nextInt();

            switch (op) {
                case 1:
                f.setTipo(TipoFeriado.NACIONAL);
                break;
                case 2:
                f.setTipo(TipoFeriado.ESTADUAL);
                    break;
                    case 3:
                    f.setTipo(TipoFeriado.MUNICIPAL);
                    break;
                    default:
                    System.out.println("Opção inválida. Tente novamente.");
                }
        } while (op != 1 && op != 2 && op != 3);

        System.out.print("Digite a descrição: ");
        f.setDescricao(sc1.nextLine());
        System.out.print("Digite a data (dd/mm/yyyy): ");
        f.setData(sc.next());
        sc.close();
        sc1.close();
        
        System.out.println("\nTipo de feriado: " + f.getTipo() +
        "\nDescrição: " + f.getDescricao() +
                            "\nData: " + f.getData());
    }
}
