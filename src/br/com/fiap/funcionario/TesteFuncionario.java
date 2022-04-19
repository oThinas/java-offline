package br.com.fiap.funcionario;

import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Scanner sc = new Scanner(System.in);
        Scanner aux = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome: ");
        f.nome = sc.next();
        System.out.print("Digite seus sobrenomes: ");
        f.sobrenome = aux.nextLine();
        System.out.print("Digite suas horas trabalhadas no mês: ");
        f.horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor por hora: ");
        f.valorPorHora = sc.nextDouble();

        System.out.println("Nome completo: " + f.nomeCompleto() +
        "\nSálario a receber: " + f.calcularSalario() +
        "\n\nAJUSTE DE SALÁRIO...");
        f.incrementarHoras(8);
        System.out.println("Novo sálario a receber: " + f.calcularSalario());
        aux.close();
        sc.close();
    }
}
