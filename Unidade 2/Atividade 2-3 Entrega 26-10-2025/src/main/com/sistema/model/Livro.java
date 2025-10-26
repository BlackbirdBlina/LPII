package com.sistema.model;

import com.sistema.anotacoes.InfoAutor;

// Usando a anotação em uma classe do sistema
@InfoAutor(nome = "Sabrina Silva", data = "26/10/2025")
public class Livro {
    private final String titulo;
    private final String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirInfo() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor);
    }
}
