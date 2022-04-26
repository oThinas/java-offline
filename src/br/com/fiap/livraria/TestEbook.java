package br.com.fiap.livraria;

public class TestEbook {
    public static void main(String[] args) {
        Ebook ebook = new Ebook();
        ebook.setTitulo("Back-end Java");
        ebook.setAutor("Eduardo Santana");
        ebook.setCategoria("Programação");
        ebook.setValor(49.9);
        ebook.setMarcaDagua("thinas@fiap.com.br");
        System.out.println("Valor do livro: " + ebook.getValor());
        ebook.aplicarDesconto();
        System.out.println("Valor do livro com desconto: " + ebook.getValor());
    }
}
