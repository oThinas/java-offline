package br.com.fiap.nano.banco;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Thinas
 * @version 1.0
 */

public abstract class Conta {
    /**
     * Número da Agência
     */
    private int agencia;
    /**
     * Número da Conta
     */
    private int numero;
    /**
     * Saldo da Conta
     */
    protected double saldo;

    public Conta(){

    }

    public Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Deposita um valor ao saldo da conta
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor){
        if (valor < 0){
            throw new ValorInvalidoException();
        }
        this.saldo += valor;
    }

    /**
     * Retira um valor do saldo da conta
     * @param valor Valor a ser retirado
     */
    public void retirar(double valor){
        this.saldo -= valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo){
          throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;
      }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double verificarSaldo();
}
