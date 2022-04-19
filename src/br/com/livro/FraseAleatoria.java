package br.com.livro;

public class FraseAleatoria {
    public static void main(String[] args) {
        String[] lista1 = {"24/7", "várias camadas", "30000 pés", "B-to-B", "todos ganham", "front-end", "baseado na Web", "difundido", "inteligente", "seis sigma", "caminho crítico", "deinâmico"};
        String[] lista2 = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distruibuído", "agrupado", "solidificado", "independente da máquina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};
        String[] lista3 = {"processo", "ponto máximo", "solução", "arquitetura", "habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão"};

        int tamanhoLista1 = lista1.length;
        int tamanhoLista2 = lista2.length;
        int tamanhoLista3 = lista3.length;

        int rand1 = (int) (Math.random() * tamanhoLista1);
        int rand2 = (int) (Math.random() * tamanhoLista2);
        int rand3 = (int) (Math.random() * tamanhoLista3);

        String frase = lista1[rand1] + " " + lista2[rand2] + " " + lista3[rand3];

        System.out.println("Precisamos de " + frase);
    }
}
