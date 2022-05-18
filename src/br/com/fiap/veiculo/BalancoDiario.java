package br.com.fiap.veiculo;

public class BalancoDiario {
    Veiculo veiculo = new Veiculo();
    private static int qtdeCarros;
    private static double total;

    public void doAdd(Veiculo obj) {
        qtdeCarros += 1;
        total += veiculo.doTotal();
    }

    public String doGerarRelatiorio() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total de carros: ");
        sb.append(qtdeCarros);
        sb.append("\n\nTotal do dia: ");
        sb.append(String.format("R$%,.2f", total));
        return sb.toString();
    }
}
