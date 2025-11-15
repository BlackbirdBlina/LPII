package main.com.sistema.estruturas;

import java.util.LinkedList;

public class LinkedListFIFO<T> implements Fila<T> {

    private final LinkedList<T> fila = new LinkedList<>();

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

