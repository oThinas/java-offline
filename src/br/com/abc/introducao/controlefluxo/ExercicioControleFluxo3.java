package br.com.abc.introducao.controlefluxo;

public class ExercicioControleFluxo3 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 100000

        int x = 0;

        while (x <= 100000) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }

        do {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        } while (x <= 100000);

        for (int i = 0; i <= 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
