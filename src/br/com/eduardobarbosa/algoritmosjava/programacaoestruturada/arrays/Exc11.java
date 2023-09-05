package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc11 {
    // Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a
    // quantidade de elementos armazenados neste vetor que são pares.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int quantidadePares = 0;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(1, 101);

            if (vetorA[i] % 2 == 0){
                quantidadePares++;
            }

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        System.out.println("\nA quantidade de números pares no vetor é: " + quantidadePares);
    }
}
