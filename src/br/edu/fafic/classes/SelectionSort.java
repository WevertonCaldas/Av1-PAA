package br.edu.fafic.classes;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] vetor, int n) {
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            if (vetor[i] != vetor[menor]) {
                int temp = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = temp;
            }
        }
        return vetor;
    }
    public static void main(String[] args) {
        int[] vetorr = new int[]{5, 4, 1, 14, 2};
        System.out.println("Vetor antes de ser ordenado: " + Arrays.toString(vetorr));
        int[] ordenarVetor = selectionSort(vetorr, vetorr.length);
        System.out.println("Vetor após a ordenação: " + Arrays.toString(vetorr));
    }
}
