package br.com.fiap.enums.desafio;

public class Feriado {
    private TipoFeriado tipo;
    private String data, descricao;

    public void setTipo(TipoFeriado tipo) {
        this.tipo = tipo;
    }

    public TipoFeriado getTipo() {
        return tipo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
