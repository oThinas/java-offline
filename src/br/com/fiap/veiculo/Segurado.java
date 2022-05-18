package br.com.fiap.veiculo;

public class Segurado extends Veiculo implements ISeguroService {
    private double seguro;

    public Segurado(double seguro) {
        this.seguro = seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }
    public double getSeguro() {
        return seguro;
    }

    
    public String doViewCupom() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subtotal: ");
        sb.append(String.format("R$%,.2f", super.doTotal()));
        sb.append("\nDesconto: ");
        sb.append(String.format("R$%,.2f", doDesconto()));
        sb.append("\n\nTotal a pagar: ");
        sb.append(String.format("R$%,.2f", doTotal()));
        return sb.toString();
    }
    
    @Override
    public double doDesconto() {
        return super.doTotal() * seguro / 100;
    }

    public double doTotal() {
        return super.doTotal() - doDesconto();
    }
}
