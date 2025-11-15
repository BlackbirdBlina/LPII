package main.com.sistema.app;

import main.com.sistema.estruturas.ArrayDequeFIFO;
import main.com.sistema.estruturas.Fila;
import main.com.sistema.estruturas.LinkedListFIFO;
import main.com.sistema.model.Cliente;

public class Main {

    public static void main(String[] args) {

        Fila<Cliente> listaLigada = new LinkedListFIFO<>();
        Fila<Cliente> arrayDeque = new ArrayDequeFIFO<>();

        System.out.println("Lista Ligada (LinkedList):");

        listaLigada.enfileirar(new Cliente("Ana", 1));
        listaLigada.enfileirar(new Cliente("Bruno", 2));
        listaLigada.enfileirar(new Cliente("Carla", 3));

        System.out.println("Clientes aguardando: " + listaLigada.tamanho());

        System.out.println("Atendendo: " + listaLigada.desenfileirar());
        System.out.println("Atendendo: " + listaLigada.desenfileirar());

        System.out.println("Clientes aguardando: " + listaLigada.tamanho());

        System.out.println("Array Deque:");

        arrayDeque.enfileirar(new Cliente("José", 1));
        arrayDeque.enfileirar(new Cliente("Maria", 2));
        arrayDeque.enfileirar(new Cliente("Antônio", 3));
        arrayDeque.enfileirar(new Cliente("Sara", 4));

        System.out.println("Clientes aguardando: " + arrayDeque.tamanho());

        System.out.println("Atendendo: " + arrayDeque.desenfileirar());
        System.out.println("Atendendo: " + arrayDeque.desenfileirar());

        System.out.println("Clientes aguardando: " + arrayDeque.tamanho());
    }
}
