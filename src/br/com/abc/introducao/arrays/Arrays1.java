package br.com.abc.introducao.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] idades = new int[3];  //A palavra new cria objetos. 3 posições = 0; 1; 2
                                    //byte, short, int, long, float, double = 0
                                    //boolean false
                                    //reference, String = null

        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;

        System.out.println("Idade 1: " + idades[0] + "\nIdade 2: " + idades[1] + "\nIdades 3: " + idades[2]);
    }
}
