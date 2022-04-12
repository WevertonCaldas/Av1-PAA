package br.edu.fafic.classes;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int vetor[], int n) {
        Integer pivo = null;
        for (int i = 1; i < n; i++) {
            pivo = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > pivo) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = pivo;
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[] vetorr = new int[]{5, 4, 1, 14, 2};
        System.out.println("Vetor antes de ser ordenado: " + Arrays.toString(vetorr));
        int[] ordenarVetor = insertionSort(vetorr, vetorr.length);
        System.out.println("Vetor após a ordenação: " + Arrays.toString(vetorr));
    }
}