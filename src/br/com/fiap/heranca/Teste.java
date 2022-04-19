package br.com.fiap.heranca;

public class Teste {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Gerente");
        g.setVenda(1000);
        System.out.println("Salário do " + g.getNome() + ": " + g.calcularSalario());
        
        Funcionario f = new Funcionario();
        f.setNome("Funcionário");
        f.setVenda(1000);
        System.out.println("Salário do " + f.getNome() + ": " + f.calcularSalario());
    }
}
