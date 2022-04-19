package br.com.fiap.moeda;

public class Moeda {
    private double valorReal, cotacaoDolar, quantidadeDolar;

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double getQuantidadeDolar() {
        return quantidadeDolar;
    }

    public void calcularConversao(){
        this.quantidadeDolar = this.valorReal / this.cotacaoDolar;
    }
}
