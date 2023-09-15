package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc2 {
    // Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os
    // elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2.

    public static void main(String[] args) {
        int[] vetorA = new int[8];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = Utils.random.nextInt(1,101);
            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        int[] vetorB = new int[8];

        System.out.print("\nVetor B: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * 2;

            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }
    }
}
