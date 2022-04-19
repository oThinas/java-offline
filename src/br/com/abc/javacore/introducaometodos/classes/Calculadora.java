package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {
    public void soma(){ //Método público que não retorna nada
        System.out.println(5 + 5);
    }

    public void subtracao(){
        System.out.println(5 - 5);
    }

    public void multiplicacao(int n1, int n2){
        System.out.println(n1 * n2);
    }

    public void divisao(double n1, double n2){
        if (n2 == 0) {
            System.out.println("Não é possível dividir por 0");
            return; //return serve como um break
        }
        System.out.println(n1 / n2);
    }

    public void alteraDoisNumeros(int n1, int n2){
        n1 = 30;
        n2 = 40;
        System.out.println("Número 1: " + n1 + "\nNúmero 2: " + n2);
    }

     public void somaArray(int[] numeros){
        int soma = 0;
         for (int num :
                 numeros) {
             soma += num;
         }
         System.out.println(soma);
     }
     
     public void somaVarArgs(int ... numeros){ //VarArgs cria um array automaticamente. É possível que o método receba mais de um parâmetro, mas somente um e o último seja varargs
        int soma = 0;
         for (int num :
                 numeros) {
             soma += num;
         }
         System.out.println(soma);
     }
}
