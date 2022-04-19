package br.com.exercicios.figura;

public class Triangulo extends Figura{
    private double base, altura;

    @Override
    public double area(){
        return this.base * this.altura;
    }

    public Triangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){

    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Triangulo [base = " +
                base +
                ", altura = " +
                altura +
                ", área = " +
                area() +
                ", cor = " +
                super.getCor() +
                "]";
    }
}
