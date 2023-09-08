package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

import java.util.ArrayList;

public class Exc14 {
    // Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a
    // média aritmética simples dos elementos ímpares armazenados neste vetor.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        ArrayList<Integer> impares = new ArrayList<>();
        int soma = 0;
        float media;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(1, 101);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }

            if (vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                impares.add(vetorA[i]);
            }
        }

        System.out.print("\nElemento(s) ímpares: ");

        if (impares.isEmpty()) {
            System.out.print("Nenhum");
        } else {
            for (int i = 0; i < impares.size() - 1; i++) {
                System.out.print(impares.get(i) + ", ");
            }

            int ultimo = impares.size() - 1;
            System.out.print(impares.get(ultimo));

            media = (float) soma / impares.size();
            System.out.println("\nA média dos elementos ímpares é: " + Utils.mask.format(media));
        }
    }
}