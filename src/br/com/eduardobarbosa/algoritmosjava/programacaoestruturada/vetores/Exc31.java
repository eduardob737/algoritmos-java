package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc31 {
    // Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando
    // apenas um vetor extra B. Sugestão: no início do vetor B armazene os elementos pares de
    // A e nas posições restantes do vetor B armazene os elementos de A que são ímpares.

    public static void main(String[] args) {

        int[] vetorA = new int[20];
        int[] vetorB = new int[20];
        int posB = 0;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(0, 101);

            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        for (int j : vetorA) {
            if (j % 2 != 0) {
                vetorB[posB] = j;
                posB++;
            }
        }

        System.out.print("\nVetor B: ");

        for (int i = 0; i < vetorB.length; i++) {
            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }
    }
}