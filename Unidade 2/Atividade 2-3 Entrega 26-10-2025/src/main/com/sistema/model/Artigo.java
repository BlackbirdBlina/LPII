package com.sistema.model;

import com.sistema.anotacoes.InfoAutor;

// Usando a anotação em uma classe do sistema
@InfoAutor(nome = "João Pereira", data = "25/10/2025")
public class Artigo {
    private final String titulo;

    public Artigo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirInfo() {
        System.out.println("Artigo: " + titulo);
    }
}
