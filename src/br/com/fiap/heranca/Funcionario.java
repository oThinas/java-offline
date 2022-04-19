package br.com.fiap.heranca;

public class Funcionario {
    protected String nome;
    protected double salario;
    private double venda;

    public double calcularSalario() {
        this.salario = this.venda * 0.3;
        return this.salario;
    }

    public String exibirSalario() {
        return "Seu salário é: R$" + this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }

    public double getVenda() {
        return venda;
    }
}
