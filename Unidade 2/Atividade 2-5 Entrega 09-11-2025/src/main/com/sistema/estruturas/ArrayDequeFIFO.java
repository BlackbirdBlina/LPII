package main.com.sistema.estruturas;

import java.util.ArrayDeque;

public class ArrayDequeFIFO<T> implements Fila<T> {

    private final ArrayDeque<T> fila = new ArrayDeque<>();

    @Override
    public void enfileirar(T obj) {
        fila.addLast(obj);
    }

    @Override
    public T desenfileirar() {
        return fila.pollFirst();
    }

    @Override
    public int tamanho() {
        return fila.size();
    }
}

