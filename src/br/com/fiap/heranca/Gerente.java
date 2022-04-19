package br.com.fiap.heranca;

public class Gerente extends Funcionario {
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + 1000;
    }
}
