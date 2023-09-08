package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

import java.util.ArrayList;

public class Exc16 {
    // Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
    // a) a soma de elementos armazenados neste vetor que são inferiores a 15;
    // b) a quantidade de elementos armazenados no vetor que são iguais a 15;
    // c) a média dos elementos armazenados no vetor que são superiores a 15.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        ArrayList<Integer> inferiores = new ArrayList<>();
        ArrayList<Integer> iguais = new ArrayList<>();
        ArrayList<Integer> superiores = new ArrayList<>();
        int somaInferiores = 0, somaSuperiores = 0;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Utils.random.nextInt(1, 101);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }

            if (vetorA[i] < 15) {
                inferiores.add(vetorA[i]);
                somaInferiores += vetorA[i];
            } else if (vetorA[i] == 15){
                iguais.add(vetorA[i]);
            } else {
                superiores.add(vetorA[i]);
                somaSuperiores += vetorA[i];
            }
        }

        System.out.print("\n\nElemento(s) inferior(es) a 15: ");

        if (inferiores.isEmpty()) {
            System.out.print("Nenhum");
        } else {
            for (int i = 0; i < inferiores.size() - 1; i++) {
                System.out.print(inferiores.get(i) + ", ");
            }

            int ultimo = inferiores.size() - 1;
            System.out.print(inferiores.get(ultimo));
        }

        System.out.print("\nElemento(s) superior(es) a 15: ");

        if (superiores.isEmpty()) {
            System.out.print("Nenhum");
        } else {
            for (int i = 0; i < superiores.size() - 1; i++) {
                System.out.print(superiores.get(i) + ", ");
            }

            int ultimo = superiores.size() - 1;
            System.out.print(superiores.get(ultimo));
        }

        System.out.println("\n\nSoma dos elementos inferiores a 15: " + somaInferiores);
        System.out.println("Quantidade de elementos iguais a 15: " + iguais.size());

        float media = (float) somaSuperiores / superiores.size();
        System.out.println("Média dos elementos superiores a 15: " + Utils.mask.format(media));

    }
}