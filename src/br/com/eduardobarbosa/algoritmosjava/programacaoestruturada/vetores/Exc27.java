package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc27 {
    // Criar um vetor A com 10 elementos inteiros.
    // Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
    // a) B[i] deverá receber 'a' quando A[i] for menor que 7;
    // b) B[i] deverá receber 'b' quando A[i] for igual a 7;
    // c) B[i] deverá receber 'c' quando A[i] for maior que 7 e menor que 10;
    // d) B[i] deverá receber 'd' quando A[i] for igual a 10; e
    // e) B[i] deverá receber 'e' quando A[i] for maior que 10.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        char[] vetorB = new char[10];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(0, 15);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        System.out.print("\nVetor B: ");

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < 7){
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7){
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else {
                vetorB[i] = 'e';
            }

            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }
    }
}