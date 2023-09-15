package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

import java.util.ArrayList;

public class Exc30 {
    // Ler um vetor com 20 elementos. Construir dois vetores B e C, sendo que nos
    // vetores B e C serão armazenados os valores pares e ímpares de A, respectivamente.

    public static void main(String[] args) {

        int[] vetorA = new int[20];
        ArrayList<Integer> vetorB = new ArrayList<>();
        ArrayList<Integer> vetorC = new ArrayList<>();

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(0, 101);

            if (vetorA[i] % 2 == 0){
                vetorB.add(vetorA[i]);
            } else {
                vetorC.add(vetorA[i]);
            }

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        System.out.print("\nVetor B: ");

        for (int i = 0; i < vetorB.size(); i++) {
            if (i == 0) {
                System.out.print(vetorB.get(i));
            } else {
                System.out.print(", " + vetorB.get(i));
            }
        }

        System.out.print("\nVetor C: ");

        for (int i = 0; i < vetorC.size(); i++) {
            if (i == 0) {
                System.out.print(vetorC.get(i));
            } else {
                System.out.print(", " + vetorC.get(i));
            }
        }
    }
}