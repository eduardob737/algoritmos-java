package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc28 {
    // Ler um vetor A com 10 elementos inteiros e construir um vetor B de mesmo
    // tipo e tamanho e com os mesmos elementos de A, sendo que estes deverão
    // estar invertidos, ou seja, o primeiro elemento de A passa a ser o último
    // de B, o segundo elemento de A passa a ser o penúltimo de B e assim por diante.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(0, 101);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        System.out.print("\nVetor B: ");

        for (int i=0, j= vetorA.length - 1; i < vetorA.length; i++, j--) {
            vetorB[i] = vetorA[j];

            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }
    }
}