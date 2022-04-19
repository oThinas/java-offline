package br.com.fiap.nano.login;

public interface Autenticavel {
    String MSG_LOGOUT = "Saindo...";

    boolean login(String usuario, String senha);

    void logout();
}
