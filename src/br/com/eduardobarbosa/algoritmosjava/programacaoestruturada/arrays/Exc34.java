package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc34 {
    // Criar um vetor A com 10 elementos inteiros. Escreva um programa que
    // imprima cada elemento do vetor A e a relação de todos os pares de 0
    // até o respectivo elemento.

    public static void main(String[] args) {

        int[] vetorA = new int[10];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(0, 101);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        System.out.println("\n");

        for (int elemento : vetorA) {
            System.out.print("Pares de 0 a " + elemento + ": ");
            for (int i = 0; i <= elemento; i++) {
                if (i == 0){
                    System.out.print(i);
                } else if (i % 2 == 0) {
                    System.out.print(", " + i);
                }
            }
            System.out.print("\n");
        }
    }
}