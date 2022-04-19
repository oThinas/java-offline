package br.com.fiap.pessoa;

public class Pessoa {
    public String dizerInformacao(String nome) {
        return "Meu nome é " + nome;
    }

    public String dizerInformacao(int idade) {
        return "Minha idade é " + idade;
    }
     public String dizerInformacao(double peso, double altura) {
        return "Meu peso é de " + peso + "kg e meço " + altura + "m";
     }
}
