package br.com.exercicios.veiuculo;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(){

    }

    public Caminhao(String placa, int ano, int eixos){
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public void exibirDados(){
        System.out.println("Modelo: caminhão" + ", placa: " + placa +
                ", ano: " + ano +
                ", eixos: " + eixos);
    }
}
