package br.com.exercicios.veiuculo;

public class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo(){

    }

    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void exibirDados(){
        System.out.println("Modelo: desconhecido" + ", placa: " + placa +
                ", ano: " + ano);
    }
}
