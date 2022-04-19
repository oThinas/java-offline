package br.com.fiap.lojaVirtual;

public class Teste {
    public static void main(String[] args) {
        Endereco e = new Endereco();
        e.setBairro("Barra Funda");
        e.setCep("01153-000");
        e.setCidade("São Paulo");
        e.setEstado("São Paulo");
        e.setLogadouro("Rua Vitorino Carmilo");
        e.setNumero("484");

        Cliente c = new Cliente();
        c.setCpf("358.199.978-16");
        c.setNome("Thiago Martins Prado");
        c.setTelefone("+55 11 96800-2293");
        c.setEndereco(e);

        System.out.println(c.getEndereco().getLogadouro());
    }
}
