package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc37 {
    // Criar um vetor A com 10 elementos inteiros.
    // Construir um vetor B de mesmo tamanho, sendo que cada elemento
    // do vetor B seja o fatorial do elemento correspondente em A.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(2, 9);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        System.out.print("\nVetor B: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
            for (int d = vetorA[i] - 1; d > 1; d--){
                vetorB[i] *= d;
            }

            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }
    }
}