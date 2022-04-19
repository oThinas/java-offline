package br.com.abc.javacore.introducaoclasses.teste;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.cpf = "123.456.789-10";
        professor.nome = "Thiago Martins Prado";
        professor.rg = "12345678-9";
        professor.matricula = "1234";

        Professor professor1 = new Professor();
        professor1.cpf = "019.876.543-21";
        professor1.matricula = "4321";
        professor1.rg = "98765432-1";
        professor1.nome = "Thinas";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);
        System.out.println("-------------------------");
        System.out.println(professor1.nome);
        System.out.println(professor1.matricula);
        System.out.println(professor1.rg);
        System.out.println(professor1.cpf);
    }
}
