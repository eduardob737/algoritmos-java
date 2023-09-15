package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

import java.util.ArrayList;

public class Exc17 {
    // Ler um vetor A com 10 elementos inteiros correspondentes as idades de
    // um grupo de pessoas. Escreva um programa que determine e escreva
    // a quantidade de pessoas que possuem idade superior a 35 anos.

    public static void main(String[] args) {

        int[] idades = new int[10];
        ArrayList<Integer> superiores = new ArrayList<>();

        System.out.print("Vetor A: ");

        for (int i = 0; i < idades.length; i++) {
            idades[i] = Utils.random.nextInt(1, 101);

            if (i == 0) {
                System.out.print(idades[i]);
            } else {
                System.out.print(", " + idades[i]);
            }

            if (idades[i] > 35) {
                superiores.add(idades[i]);
            }
        }

        System.out.println("\nQuantidade de pessoas com idade superior a 35 anos: " + superiores.size());
    }
}
