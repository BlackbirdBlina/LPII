package main.com.sistema.model;

public class Cliente {

    private final String nome;
    private final int senha;

    public Cliente(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return nome + " (senha: " + senha + ")";
    }
}

