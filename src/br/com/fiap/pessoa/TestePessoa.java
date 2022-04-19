package br.com.fiap.pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.dizerInformacao("Thiago"));
        System.out.println(p.dizerInformacao(18));
        System.out.println(p.dizerInformacao(70.0, 1.82));
    }
}
