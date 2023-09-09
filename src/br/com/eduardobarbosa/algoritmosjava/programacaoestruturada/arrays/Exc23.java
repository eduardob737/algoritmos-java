package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc23 {
    // Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique
    // se "todos" os elementos do vetor A são pares. Se pelo menos um elemento do vetor
    // não for par o processo de repetição para percorrer os elementos do vetor deve ser
    // encerrado, como sugestão utilize uma variável do tipo flag para atingir esse propósito.

    public static void main(String[] args) {

        int[] vetorA = new int[10];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(0, 101);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(" | " + vetorA[i]);
            }
        }

        System.out.print("\nPares: ");

        for (int i : vetorA){
            if (i % 2 != 0){
                break;
            }

            if (i != vetorA[0]) {
                System.out.print(", " + i);
            } else {
                System.out.print(i);
            }
        }
    }
}
