package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc29 {
    // Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo
    // este a junção dos dois outros vetores. Os primeiros 10 elementos de C deverão
    // receber os elementos de A e os últimos elementos C deverão receber os elementos de B.
    // Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[20];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(0, 101);
            vetorC[i] = vetorA[i];

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        System.out.print("\nVetor B: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = Utils.random.nextInt(0, 101);
            vetorC[i + 10] = vetorB[i];

            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }

        System.out.print("\nVetor C: ");

        for (int i = 0; i < vetorC.length; i++) {
            if (i == 0) {
                System.out.print(vetorC[i]);
            } else {
                System.out.print(", " + vetorC[i]);
            }
        }
    }
}