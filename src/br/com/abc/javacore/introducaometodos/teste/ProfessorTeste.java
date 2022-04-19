package br.com.abc.javacore.introducaometodos.teste;


import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.cpf = "123456789-10";
        prof.rg = "12345678-9";
        prof.matricula = "1234";
        prof.nome = "Thiago";

        //prof.imprime(prof); //Antes do this.
        prof.imprime();

        Professor matematica = new Professor();

        matematica.cpf = "787456123-85";
        matematica.matricula = "1237";
        matematica.rg = "78945632-1";
        matematica.nome = "João";

        //prof.imprime(matematica); //Como tanto prof quanto matematica estão usando a classe Professor, as duas podem iniciar o método imprime() //Antes do this.
        matematica.imprime();
    }
}
