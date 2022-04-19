package br.com.fiap.lojaVirtual;

public class Endereco {
    private String cep, logadouro, numero, bairro, cidade, estado;

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
