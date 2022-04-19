package br.com.exercicios.veiuculo;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(){

    }

    public Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void exibirDados(){
        System.out.println("Modelo: ônibus" + ", placa: " + placa +
                ", ano: " + ano +
                ", assentos: " + assentos);
    }
}
