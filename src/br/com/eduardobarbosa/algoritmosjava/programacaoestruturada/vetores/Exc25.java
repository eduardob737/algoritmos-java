package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc25 {
    // Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
    // obedecendo as seguintes regras de formação:
    // a) B[i] deverá receber 1 quando A[i] for par;
    // b) B[i] deverá receber 0 quando A[i] for ímpar.

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

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] % 2 == 0 ? 1 : 0;

            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }
    }
}