package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class ParametrosTeste {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        Calculadora calc = new Calculadora();

        calc.alteraDoisNumeros(num1, num2);
        System.out.println("Números reais: " + num1 + " e " + num2);
    }
}
