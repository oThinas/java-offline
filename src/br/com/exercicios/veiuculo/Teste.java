package br.com.exercicios.veiuculo;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("XPO-0978", 2010));
        veiculos.add(new Veiculo("ABC-1234", 2012));
        veiculos.add(new Onibus("ZCS-4856", 2014, 30));
        veiculos.add(new Caminhao("NXO-3028", 2011, 5));
        veiculos.add(new Caminhao("HJU-3341", 2000, 7));

        for (Veiculo veiculo :
                veiculos) {
            veiculo.exibirDados();
        }
    }
}
