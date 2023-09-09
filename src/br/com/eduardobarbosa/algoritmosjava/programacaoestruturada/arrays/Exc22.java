package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.arrays;

public class Exc22 {
    // Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão:
    // A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar um programa
    // que determine o percentual de números 0's e 1's existentes no vetor A.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int contZeros = 0, contUns = 0;
        int porcentagemZeros, porcentagemUns;

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }

            if (vetorA[i] == 0) {
                contZeros++;
            } else {
                contUns++;
            }
        }

        porcentagemZeros = contZeros * 10;
        porcentagemUns = contUns * 10;

        System.out.println("\nPorcentagem de 0's: " + porcentagemZeros + "%");
        System.out.print("Porcentagem de 1's: " + porcentagemUns + "%");
    }
}
