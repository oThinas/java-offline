package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Thinas";
        nomes[1] = "Taís";
        nomes[2] = "Juca";

        int i = 0;

        while (i < nomes.length) {
            System.out.println("Nome número " + (1 + i) + ": " + nomes[i]);
            i++;
        }

        for (int x = 0; x < nomes.length; x++) {
            System.out.println("Nome número " + (1 + x) + ": " + nomes[x]);
        }
    }
}
