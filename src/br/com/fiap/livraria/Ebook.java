package br.com.fiap.livraria;

public class Ebook extends Livro {
    private String marcaDagua;

    @Override
    public void aplicarDesconto() {
        super.valor *= 0.85;
    }

    public void setMarcaDagua(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }

    public String getMarcaDagua() {
        return marcaDagua;
    }
}
