package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc26 {
    // Criar dois vetores A e B cada um com 10 elementos inteiros.
    // Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    // a) C[i] deverá receber 1 quando A[i] for maior que B[i];
    // b) C[i] deverá receber 0 quando A[i] for igual a B[i];
    // c) C[i] deverá receber -1 quando A[i] for menor que B[i].

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

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
            vetorB[i] = Utils.random.nextInt(0, 101);

            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }

        System.out.print("\nVetor C: ");

        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else {
                vetorC[i] = -1;
            }

            if (i == 0) {
                System.out.print(vetorC[i]);
            } else {
                System.out.print(", " + vetorC[i]);
            }
        }
    }
}