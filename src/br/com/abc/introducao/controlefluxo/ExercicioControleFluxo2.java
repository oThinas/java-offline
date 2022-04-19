package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        //Crie um switch que, dado um valor de 1 a 7 e, considerando 1 como domindo e 7 como sábado, imprima se é dia útil ou fim de semana.

        byte dia = 10;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("É fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
