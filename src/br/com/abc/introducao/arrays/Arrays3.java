package br.com.abc.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
//        int[] numeros = new int[5];
        int[] numeros = {1,2,3,4,5}; //Tamanho é 5, mas o índice vai de 0 a 4
//        int[] numeros = new int[]{1,2,3,4,5}; //Tamanho é 5, mas o índice vai de 0 a 4

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

        for (int aux : numeros) {
            System.out.println(aux);
        }
    }
}
