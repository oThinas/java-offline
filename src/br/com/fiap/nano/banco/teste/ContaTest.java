package br.com.fiap.nano.banco.teste;

import br.com.fiap.nano.banco.Conta;
import br.com.fiap.nano.banco.ContaCorrente;
import br.com.fiap.nano.banco.ContaPoupanca;

public class ContaTest {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        //Conta cc = new Conta(123, 321, 50); //Antes do encapsulamento

        cc.depositar(50);
        cc.setAgencia(123);
        cc.setNumero(321);
        cc.depositar(100);

        //System.out.println(cc.verificarSaldo()); //Antes do encapsulamento
        System.out.println(cc.getSaldo());


        Conta poupanca = new ContaPoupanca(111, 222, 1000);

        /* //Antes do encapsulamento
        Conta poupanca = new Conta();
        poupanca.agencia = 111;
        poupanca.numero = 222;
        poupanca.saldo = 1000;
         */

        poupanca.retirar(50);
        //System.out.println(poupanca.verificarSaldo()); //Antes do encapsulamento
        System.out.println(poupanca.getSaldo());

        Conta c = new ContaCorrente();
        
        
        try{
            c.sacar(100);
        } catch (Exception e){
            e.printStackTrace();
        }
        c.depositar(200);
        System.out.println(c.getSaldo());
    }
}
