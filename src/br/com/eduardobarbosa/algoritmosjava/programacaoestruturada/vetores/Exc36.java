package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

public class Exc36 {
    // Criar um vetor A com 11 elementos indexados de 0 at� 10. Sendo que
    // cada elemento do vetor A � formado pela pot�ncia de base 2 elevado
    // ao expoente igual a posi��o do respectivo elemento, ou seja: A[i] = 2^i.

    public static void main(String[] args) {

        int[] vetorA = new int[11];

        System.out.print("Vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.pow(2, i);

            if (i == 0) {
                System.out.print(vetorA[i]);
            } else {
                System.out.print(", " + vetorA[i]);
            }
        }
    }
}