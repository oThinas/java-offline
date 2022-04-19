package br.com.fiap.enums;

public class FormaPagamento {
    private int id;
    private String nome;
    private TipoFormaPagamentoEnum tipo;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(TipoFormaPagamentoEnum tipo) {
        this.tipo = tipo;
    }

    public TipoFormaPagamentoEnum getTipo() {
        return tipo;
    }
}
