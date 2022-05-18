package br.com.fiap.veiculo.teste;

import br.com.fiap.veiculo.BalancoDiario;
import br.com.fiap.veiculo.Segurado;

public class TesteEstacionamento {
    public static void main(String[] args) {
        Segurado veicSeg = new Segurado(10);
        BalancoDiario bd = new BalancoDiario();
        veicSeg.setValorHora(5);
        veicSeg.setValorAdicional(2);
        veicSeg.setHoras(0);
        System.out.println(veicSeg.doViewCupom());

        bd.doAdd(veicSeg);
        System.out.println(bd.doGerarRelatiorio());
    }
}
