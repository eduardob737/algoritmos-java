package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc24 {
    // Números palíndromos são aqueles que escritos da direita para a esquerda têm o
    // mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987;
    // 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de
    // 10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor e
    // igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim por
    // diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um
    // palíndromo.

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int indexUltimo = vetorA.length - 1;
        boolean palindromo = true;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o elemento " + i + ": ");
            vetorA[i] = Utils.scanner.nextInt();
        }

        System.out.print("\nVetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }

        for (int i = 0; i < (vetorA.length / 2); i++){
            if (vetorA[i] != vetorA[indexUltimo - i]){
                palindromo = false;
                break;
            }
        }

        if (palindromo){
            System.out.println("\nVetor A é palíndromo");
        } else {
            System.out.println("\nVetor A não é palíndromo.");
        }
    }
}