package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

import java.util.ArrayList;

public class Exc13 {
    // Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a
    // soma de todos os elementos armazenados neste vetor que são múltiplos de 5.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        ArrayList<Integer> multiplosDeCinco = new ArrayList<>();
        int soma = 0;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(1, 101);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }

            if (vetorA[i] % 5 == 0) {
                soma += vetorA[i];
                multiplosDeCinco.add(vetorA[i]);
            }
        }

        System.out.print("\nElemento(s) múltiplo(s) de 5: ");

        if (multiplosDeCinco.isEmpty()) {
            System.out.print("Nenhum");
        } else {
            for (int i = 0; i < multiplosDeCinco.size() - 1; i++) {
                System.out.print(multiplosDeCinco.get(i) + ", ");
            }

            int ultimo = multiplosDeCinco.size() - 1;
            System.out.print(multiplosDeCinco.get(ultimo));
        }

        System.out.println("\nA soma dos elementos múltiplos de 5 é: " + soma);
    }
}
