package br.com.fiap.bhaskara;

public class Equacao {
    public int a, b, c, delta;

    public Equacao(){

    }

    public Equacao(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calcDelta(){
        this.delta = this.b * this.b - 4 * this.a * this.c;
    }

    public String raiz(){
        if (this.delta == 0){
            return "Solução vazia";
        } else {
            return "x1 = " + (this.b * (-1) + Math.sqrt(delta)) / (2 * this.a)
                    + "\nx2 = " + (this.b * (-1) - Math.sqrt(delta)) / (2 * this.a);
        }
    }
}