package br.com.exercicios.figura;

public class Quadrado extends Retangulo{
    @Override
    public double area() {
        return this.getLado1() * this.getLado1();
    }

    public Quadrado(){
        super();
    }

    public Quadrado(String cor, double lado1, double lado2){
        super(cor, lado1, lado2);
    }

    public Quadrado(String cor, double lado){
        lado = super.getLado1();
    }

    @Override
    public String toString() {
        return "Quadrado [lado = " +
                getLado1() +
                ", área = " +
                area() +
                ", cor = " +
                super.getCor() +
                "]";
    }
}
