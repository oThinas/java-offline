package br.com.fiap.nano.banco;

public class ContaCorrente extends Conta{
    private String tipo;
    private double chequeEspecial;
    private double limite;

    public ContaCorrente(){

    }

    public ContaCorrente(int agencia, int numero, double saldo, String tipo, double chequeEspecial){
        super(agencia, numero, saldo);
        this.tipo = tipo;
        this.chequeEspecial = chequeEspecial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel(){
        return getSaldo() + this.chequeEspecial;
    }

    @Override
    public void retirar(double valor) {
        super.retirar(valor);
        valor += 10;
    }

    @Override
    public double verificarSaldo() {
        return saldo + limite;
    }
}
