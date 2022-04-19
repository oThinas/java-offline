package br.com.abc.introducao.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 11;

        while (contador < 10) {                   //while (boolean){ <incremento> }
            System.out.println(++contador);
        }

//        contador = 0;
//        do {                                             //do{ <incremento> }while (boolean);
//            System.out.println("Esse é o do while: " + (1 + contador++));
//        } while (contador < 10);

        for (int x = 0; x < 10; x++){ //for(<variavel declarada>; boolean, <incremento>){ }
            System.out.println(1+x);
            if (x == 5) {
                break;
            }
        }
    }
}
