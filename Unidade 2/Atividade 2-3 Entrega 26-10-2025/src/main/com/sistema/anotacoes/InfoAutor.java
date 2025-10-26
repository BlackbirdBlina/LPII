package com.sistema.anotacoes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Anotação que pode ser lida através de uma Reflection
@Retention(RetentionPolicy.RUNTIME)
public @interface InfoAutor {
    String nome();
    String data();
}
