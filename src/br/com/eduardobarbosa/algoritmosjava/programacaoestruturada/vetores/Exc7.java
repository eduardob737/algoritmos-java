package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc7 {
    // Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada
    // elemento de C � a subtra��o dos respectivos elementos em A e B, ou seja:
    // C[i] = A[i] - B[i].

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(1, 101);
            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        System.out.print("\nVetor B: ");

        for (int i = 0; i < vetorB.length; i++){
            vetorB[i] = Utils.random.nextInt(1, 101);
            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }

        System.out.print("\nVetor C: ");

        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];
            if (i == 0) {
                System.out.print(vetorC[i]);
            } else {
                System.out.print(", " + vetorC[i]);
            }
        }
    }
}
