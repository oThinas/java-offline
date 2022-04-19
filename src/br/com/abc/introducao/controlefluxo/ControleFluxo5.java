package br.com.abc.introducao.controlefluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado. As parcelas não podem valer menos do que R$1000

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                break;
            }

            System.out.println("Parcela " + parcela + " R$" + valorParcela);

//            if (valorParcela >= 1000) {
//                System.out.println("Parcela " + parcela + " R$" + valorParcela);
//            }
//            else {
//                break; //Evitar desperdício de processamento
//            }
        }
    }
}
