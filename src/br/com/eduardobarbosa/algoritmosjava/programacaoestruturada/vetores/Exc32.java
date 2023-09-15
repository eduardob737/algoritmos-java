package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc32 {
    // Criar um vetor A com 5 elementos inteiros. Escreva um programa que
    // imprima a tabuada de cada um dos elementos do vetor A.

    public static void main(String[] args) {

        int[] vetorA = new int[5];

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
            for (int i = 0; i <= 10; i++) {
                System.out.println(elemento + " x " + i + " = " + elemento * i);
            }
            System.out.println("-------------------");
        }
    }
}
