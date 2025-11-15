package main.com.sistema.estruturas;

public interface Fila<T> {

    void enfileirar(T obj);
    T desenfileirar();
    int tamanho();
    
}
