package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc12 {
    // Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a
    // soma de todos os elementos armazenados neste vetor.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int soma = 0;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(1, 101);

            soma += vetorA[i];

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        System.out.println("\nA soma dos elementos do vetor é: " + soma);
    }
}
