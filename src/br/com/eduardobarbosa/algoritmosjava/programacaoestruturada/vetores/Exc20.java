package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc20 {
    // Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$)
    // e a seguir armazene em vetor A com 20 elementos as seguintes conversões:
    // A[i] = cotação do dolar * i, para todo i variando de 1 até 20.

    public static void main(String[] args) {

        float[] vetorA = new float[20];
        float cotacao;

        System.out.print("Digite a cotação do dólar (U$) em relação ao real (R$): ");
        cotacao = Utils.scanner.nextFloat();

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);

            if (i == 0) {
                System.out.print(Utils.mask.format(vetorA[i]));
            } else {
                System.out.print(" | " + Utils.mask.format(vetorA[i]));
            }
        }

    }
}
