package br.com.fiap.enums;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FormaPagamento forma = new FormaPagamento();
        System.out.print("Id: ");
        forma.setId(sc.nextInt());
        System.out.print("Nome: ");
        forma.setNome(sc.next());

        int op = 0;
        do {
            System.out.println("Forma de pagamento: " + 
                                "\n1 - Cartão de débito" +
                                "\n2 - Cartão de crédito" +
                                "\n3 - Boleto" +
                                "\n4 - Vale Refeição");
            op = sc.nextInt();
            if (op == 1) {
                forma.setTipo(TipoFormaPagamentoEnum.CARTAO_CREDITO);
            }

            switch (op) {
                case 1:
                    forma.setTipo(TipoFormaPagamentoEnum.CARTAO_DEBITO);
                    break;
                case 2:
                    forma.setTipo(TipoFormaPagamentoEnum.CARTAO_CREDITO);
                    break;
                case 3:
                    forma.setTipo(TipoFormaPagamentoEnum.BOLETO);
                    break;
                case 4: 
                    forma.setTipo(TipoFormaPagamentoEnum.VALE_REFEICAO);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (op != 1 && op != 2 && op != 3 && op != 4);
        
        sc.close();

        System.out.println("Id: " + forma.getId() +
                            "\nNome: " + forma.getNome() +
                            "\nForma de pagamento: " + forma.getTipo());
    }
}
