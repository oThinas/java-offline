package br.com.abc.introducao.controlefluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia){ //dentro do (), podem conter variáveis como: char, int, byte, short, enum e String
            case 1:
                System.out.println("Hoje é domingo");
                break;
            case 2:
                System.out.println("Hoje é segunda");
                break;
            case 3:
                System.out.println("Hoje é terça");
                break;
            case 4:
                System.out.println("Hoje é quarta");
                break;
            case 5:
                System.out.println("Hoje é quinta");
                break;
            case 6:
                System.out.println("Hoje é sexta");
                break;
            case 7:
                System.out.println("Hoje é sábado");
        }

        char sexo = 'F';

        switch (sexo){
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
