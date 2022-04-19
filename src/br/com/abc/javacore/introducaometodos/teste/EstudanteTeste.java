package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante();
        aluno1.nome = "Thiago";
        aluno1.idade = 17;
        //aluno1.notas = new double[]{7, 4, 6};

        aluno1.media();
    }
}
