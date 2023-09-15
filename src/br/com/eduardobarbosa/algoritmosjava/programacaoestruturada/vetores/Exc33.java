package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc33 {
    // Criar um vetor A com 10 elementos inteiros. Escreva um programa que
    // imprima cada elemento do vetor A e uma mensagem indicando se o respectivo
    // elemento é um número primo ou não.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        boolean primo;

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
            primo = true;
            for (int i = 2; i < elemento; i++) {
                if (elemento % i == 0) {
                    System.out.println(elemento + " não é primo");
                    primo = false;
                    break;
                }
            }
            if (primo)
                System.out.println(elemento + " é primo");
        }
    }
}