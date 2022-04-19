package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.soma();
        calc.subtracao();
        calc.multiplicacao(5, 5);
        calc.divisao(20, 0);

        System.out.println("Continuando execução");
        System.out.println("---------------------");

        int[] numeros = {1, 2, 3, 4, 5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1, 2, 3, 4);
    }
}
