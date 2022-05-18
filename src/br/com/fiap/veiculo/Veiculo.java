package br.com.fiap.veiculo;

public class Veiculo {
    private double valorHora, valorAdicional, horas;

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getValorHora() {
        return valorHora;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    public double getHoras() {
        return horas;
    }
    
    public double doTotal() {
        return valorHora + valorAdicional * (horas - 1);
    }
    
    public String doViewCupom() {
        return "Total a pagar: " + String.format("R$:%,.2f", doTotal());
    }
}
