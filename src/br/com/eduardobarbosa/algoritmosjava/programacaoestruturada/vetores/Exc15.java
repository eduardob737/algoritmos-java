package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

import java.util.ArrayList;

public class Exc15 {
    // Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual
    // de elementos pares e ímpares, respectivamente, armazenados neste vetor.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        int porcentagemPares, porcentagemImpares;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(1, 101);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }

            if (vetorA[i] % 2 == 0) {
                pares.add(vetorA[i]);
            } else {
                impares.add(vetorA[i]);
            }
        }

        porcentagemPares = pares.size() * 10;
        porcentagemImpares = impares.size() * 10;

        System.out.print("\n\n" + pares.size() + " elemento(s) pares (" + porcentagemPares + "%): ");

        if (pares.isEmpty()) {
            System.out.print("Nenhum");
        } else {
            for (int i = 0; i < pares.size() - 1; i++) {
                System.out.print(pares.get(i) + ", ");
            }

            int ultimo = pares.size() - 1;
            System.out.print(pares.get(ultimo));
        }

        System.out.print("\n" + impares.size() + " elemento(s) ímpares (" + porcentagemImpares + "%): ");

        if (impares.isEmpty()) {
            System.out.print("Nenhum");
        } else {
            for (int i = 0; i < impares.size() - 1; i++) {
                System.out.print(impares.get(i) + ", ");
            }

            int ultimo = impares.size() - 1;
            System.out.print(impares.get(ultimo));
        }
    }
}