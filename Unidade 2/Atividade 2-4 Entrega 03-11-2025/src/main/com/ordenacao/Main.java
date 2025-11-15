package main.com.ordenacao;

import java.util.Arrays;
import java.util.Random;
import main.com.ordenacao.algoritmos.BubbleSort;
import main.com.ordenacao.algoritmos.QuickSort;

public class Main {

    public static void main(String[] args) {
        final int N = 100_000;
        Random random = new Random();

        int[] numeros = new int[N];
        for (int i = 0; i < N; i++)
            numeros[i] = random.nextInt(1_000_000);

        int[] copiaBubble = Arrays.copyOf(numeros, N);
        int[] copiaQuick = Arrays.copyOf(numeros, N);

        long inicioBubble = System.nanoTime();
        BubbleSort.bubbleSortInc(copiaBubble);
        long fimBubble = System.nanoTime();
        long tempoBubble = fimBubble - inicioBubble;

        long inicioQuick = System.nanoTime();
        QuickSort.quickSortInc(copiaQuick);
        long fimQuick = System.nanoTime();
        long tempoQuick = fimQuick - inicioQuick;

        System.out.println("Resultados:");
        System.out.printf("Tempo Bubble Sort: %.3f segundos%n", tempoBubble / 1e9);
        System.out.printf("Tempo Quick Sort:  %.3f segundos%n", tempoQuick / 1e9);
        System.out.println();

        if (tempoBubble < tempoQuick)
            System.out.println("O Bubble Sort foi mais rápido (improvável em listas grandes).");
        else if (tempoQuick < tempoBubble)
            System.out.println("O Quick Sort foi mais rápido (esperado, devido à complexidade O(n log n)).");
        else
            System.out.println("Ambos tiveram tempos muito próximos.");

        System.out.println("Motivo esperado: o Bubble Sort é O(n²), enquanto o Quick Sort é O(n log n) em média.");
    }
}
