package br.com.fiap.list;

public class Comodo {
    private String nome;
    private double largura, altura, area;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }

    public void areaComodo() {
        this.area = this.altura * this.largura;
    }
}
