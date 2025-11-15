package main.com.ordenacao.algoritmos;

public class BubbleSort {

    public static void bubbleSortInc(int[] v) {
        int tamanho = v.length;
        for (int i = 0; i < tamanho - 1; i++) {
            boolean flag = false;
            
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = aux;
                    flag = true;
                }
            }

            if (!flag){
                break;
            }
        }
    }
}
