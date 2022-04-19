package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
        Crie uma variável <salario> e imprima seu imposto conforme a tabela
        salario < 1000 = 5% de imposto
        1000 <= salario < 2000 = 10% de imposto
        2000 <= salario < 4000 = 15% de imposto
        4000 <= salario = 20% de imposto
         */

        int salario = 3000;
        double imposto;

        if(salario < 1000){
            imposto = 0.05 * salario;
        }
        else if(1000 <= salario && salario < 2000){
            imposto = 0.1 * salario;
        }
        else if(2000 <= salario && salario < 4000){
            imposto = 0.15 * salario;
        }
        else{
            imposto = 0.2 * salario;
        }
        System.out.println("Valor a pagar: R$" + imposto);
    }
}
