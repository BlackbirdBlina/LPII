package main.com.ordenacao.algoritmos;

import java.util.Random;
import java.util.Stack;

public class QuickSort {

    static class ParIndices {
        int inicio, fim;
        ParIndices(int inicio, int fim) {
            this.inicio = inicio;
            this.fim = fim;
        }
    }

    private static int pivoRandom(int inicio, int fim, Random random) {
        return random.nextInt(fim - inicio + 1) + inicio;
    }

    private static int quickDividInc(int[] v, int indiceFirstElemento, int indiceLastElemento, Random random) {
        int indicePivo = pivoRandom(indiceFirstElemento, indiceLastElemento, random);
        int aux = v[indicePivo];
        v[indicePivo] = v[indiceLastElemento];
        v[indiceLastElemento] = aux;

        int indiceInc = indiceFirstElemento;
        int indiceDec = indiceLastElemento - 1;

        while (indiceDec >= indiceInc) {
            while (indiceDec >= indiceInc && v[indiceInc] < v[indiceLastElemento] && indiceDec >= indiceInc)
                ++indiceInc;
            while (indiceDec >= indiceInc && v[indiceDec] > v[indiceLastElemento] && indiceDec >= indiceInc)
                --indiceDec;
            if (indiceDec >= indiceInc) {
                aux = v[indiceInc];
                v[indiceInc] = v[indiceDec];
                v[indiceDec] = aux;
                ++indiceInc;
                --indiceDec;
            }
        }

        aux = v[indiceLastElemento];
        v[indiceLastElemento] = v[indiceInc];
        v[indiceInc] = aux;

        return indiceInc;
    }

    public static void quickSortInc(int[] v) {
        int tamanho = v.length;
        if (tamanho <= 1)
            return;

        Random random = new Random();
        Stack<ParIndices> pilha = new Stack<>();
        pilha.push(new ParIndices(0, tamanho - 1));

        while (!pilha.isEmpty()) {
            ParIndices top = pilha.pop();
            int indicePivo = quickDividInc(v, top.inicio, top.fim, random);

            if (indicePivo < top.fim)
                pilha.push(new ParIndices(indicePivo + 1, top.fim));
            if (indicePivo > top.inicio)
                pilha.push(new ParIndices(top.inicio, indicePivo - 1));
        }
    }
}
