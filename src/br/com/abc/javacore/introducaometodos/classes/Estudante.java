package br.com.abc.javacore.introducaometodos.classes;

public class Estudante {
    public String nome;
    public int idade;
    public double[] notas;

    public void media(){
        String situacao = "reprovado";
        double media = 0;

        if(notas != null) {
            for (double nota :
                    notas) {
                media += nota;
            }
            media = media / notas.length;

            if (media >= 6) {
                situacao = "aprovado";
            }

            System.out.println("O aluno " + this.nome + " (" + this.idade + "), recebeu as seguintes notas:");
            int i = 0;
            while (i < notas.length) {
                System.out.println("Nota " + (i + 1) + ": " + this.notas[i]);
                i++;
            }
            System.out.println("Sua média foi: " + media);
            System.out.println("Aluno " + situacao);
        }
        else {
            System.out.println("Informe as notas!");
        }
    }
}
