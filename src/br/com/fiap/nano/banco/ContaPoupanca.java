package br.com.fiap.nano.banco;

public final class ContaPoupanca extends Conta{
    public ContaPoupanca(){

    }

    public ContaPoupanca(int agencia, int numero, double saldo){
        super(agencia, numero, saldo);
    }

    @Override
    public double verificarSaldo() {
        return saldo;
    }
}
