package br.com.fiap.produto;

public class CarrinhoCompra {
    private double total;

    public void adicionar(Produto produto) {
        this.total += produto.calcularSubTotal();
    }

    public double finalizarCompra() {
        return this.total;
    }

    public double getTotal() {
        return total;
    }
}
