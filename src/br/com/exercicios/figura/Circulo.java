package br.com.exercicios.figura;

public class Circulo extends Figura{
    private double raio;

    @Override
    public double area() {
        return this.raio * this.raio * 3.14;
    }

    public Circulo(){

    }

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    public double getDiametro(){
        return raio * 2;
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [" +
                "raio = " + raio +
                ", área = " +
                area() +
                ", cor = " +
                super.getCor() +
                "]";
    }
}
