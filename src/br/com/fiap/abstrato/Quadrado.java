package br.com.fiap.abstrato;

public class Quadrado extends PoligonoRegular {
    @Override
    public double calcularArea() {
        return super.getTamLado() * super.getTamLado();
    }
}
