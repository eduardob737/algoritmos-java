package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc18 {
    // Ler um vetor A com 10 elementos inteiros correspondentes as idades de
    // um grupo de pessoas. Escreva um programa que determine e escreva
    // a menor e a maior idades e suas respectivas posições.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int posMenor = -1, posMaior = -1;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(1, 101);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }

            if (vetorA[i] > maior) {
                maior = vetorA[i];
                posMaior = i;
            }

            if (vetorA[i] < menor) {
                menor = vetorA[i];
                posMenor = i;
            }
        }

        System.out.println("\n\nMenor idade: " + menor + " / Posição: " + posMenor);
        System.out.println("Maior idade: " + maior + " / Posição: " + posMaior);
    }
}