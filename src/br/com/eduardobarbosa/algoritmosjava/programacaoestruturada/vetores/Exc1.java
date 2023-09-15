package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc1 {
    // Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos"
    // elementos do vetor A, ou seja, B[i] = A[i].

    public static void main(String[] args) {
        int[] vetorA = new int[5];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = Utils.random.nextInt(1,101);
                if (i == 0) {
                    System.out.print(vetorA[i]);
                } else {
                    System.out.print(", " + vetorA[i]);
                }
        }

        int[] vetorB = vetorA;

        System.out.print("\nVetor B: ");

        for (int elemento : vetorB){
            if (elemento == vetorB[0]) {
                System.out.print(elemento);
            } else {
                System.out.print(", " + elemento);
            }
        }

    }
}
