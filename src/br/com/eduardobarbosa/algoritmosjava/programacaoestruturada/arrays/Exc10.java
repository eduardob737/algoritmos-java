package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc10 {
    // Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
    // tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão
    // do respectivo elementos de A por 2 (dois), ou seja:

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

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

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] % 2;
            if (i == 0) {
                System.out.print(vetorB[i]);
            } else {
                System.out.print(", " + vetorB[i]);
            }
        }
    }
}
