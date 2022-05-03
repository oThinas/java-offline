package br.com.fiap.produto;

public class Dvd extends Produto {
    private String diretor;
    private int anoLancamento;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
    public String getDiretor() {
        return diretor;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
}
