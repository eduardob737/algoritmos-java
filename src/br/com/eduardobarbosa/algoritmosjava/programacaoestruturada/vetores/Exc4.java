package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc4 {

    // Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho,
    // sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja
    // B[i] = sqrt(A[i]).

    public static void main(String[] args) {

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

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
            vetorB[i] = Math.sqrt(vetorA[i]);
            if (i == 0) {
                System.out.print(Utils.mask.format(vetorB[i]));
            } else {
                System.out.print(", " + Utils.mask.format(vetorB[i]));
            }
        }
    }
}
