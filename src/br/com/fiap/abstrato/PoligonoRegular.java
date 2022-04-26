package br.com.fiap.abstrato;

public abstract class PoligonoRegular {
    private double numLados, tamLado;

    public void setNumLados(double numLados) {
        this.numLados = numLados;
    }

    public double getNumLados() {
        return numLados;
    }

    public void setTamLado(double tamLado) {
        this.tamLado = tamLado;
    }

    public double getTamLado() {
        return tamLado;
    }

    public double calcularPerimetro() {
        return this.numLados * this.tamLado;
    }

    public abstract double calcularArea();
}
