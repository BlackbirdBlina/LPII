package com.sistema;

import com.sistema.anotacoes.InfoAutor;
import com.sistema.model.Artigo;
import com.sistema.model.Livro;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Class<?>> classes = Arrays.asList(Livro.class, Artigo.class);

        System.out.println("Classes anotadas com @InfoAutor\n");

        for (Class<?> classe : classes) {

            /* Usando reflexão para identificar (faz a leitura de uma anotação)
            quando a anotação foi usada e em seguida exibe na tela */
            if (classe.isAnnotationPresent(InfoAutor.class)) {

                InfoAutor info = classe.getAnnotation(InfoAutor.class);

                System.out.println("Classe: " + classe.getSimpleName());
                System.out.println("Autor: " + info.nome());
                System.out.println("Data: " + info.data() + "\n");
            }
        }
    }
}
