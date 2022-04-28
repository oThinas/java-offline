package br.com.fiap.abstrato;

public class Triangulo extends PoligonoRegular {
    @Override
    public double calcularArea() {
        return (super.getTamLado() * super.getTamLado() * Math.sqrt(3)) / 4;
    }
}
