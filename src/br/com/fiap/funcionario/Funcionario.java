package br.com.fiap.funcionario;

public class Funcionario {
    public String nome, sobrenome;
    public int horasTrabalhadas;
    public double valorPorHora;

    public String nomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }

    public double calcularSalario() {
        return this.horasTrabalhadas * this.valorPorHora;
    }

    public void incrementarHoras(int valor) {
        this.valorPorHora += valor;
    }
}
