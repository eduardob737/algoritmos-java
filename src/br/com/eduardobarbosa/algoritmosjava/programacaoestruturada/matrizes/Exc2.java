package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.matrizes;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc2 {
    // Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0 e 9.
    // Após isso indique qual é o maior e o menor valor da linha 5 e o maior e
    // o menor valor da coluna 7.

    public static void main(String[] args) {

        int[][] matrizM = new int[10][10];
        int maiorLinha5 = Integer.MIN_VALUE;
        int maiorColuna7 = Integer.MIN_VALUE;
        int menorLinha5  = Integer.MAX_VALUE;
        int menorColuna7 = Integer.MAX_VALUE;

        System.out.println("Matriz M: ");

        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j < matrizM[i].length; j++){
                matrizM[i][j] = Utils.random.nextInt(101);

                if (j == 0){
                    System.out.print(matrizM[i][j]);
                } else {
                    System.out.print(", " + matrizM[i][j]);
                }
            }
            System.out.println();
        }

        for (int i : matrizM[5]) {
            if (i > maiorLinha5) {
                maiorLinha5 = i;
            }
            if (i < menorLinha5) {
                menorLinha5 = i;
            }
        }

        for (int[] ints : matrizM) {
            if (ints[7] > maiorColuna7) {
                maiorColuna7 = ints[7];
            }
            if (ints[7] < menorColuna7) {
                menorColuna7 = ints[7];
            }
        }

        System.out.println("\nMaior na linha 5: " + maiorLinha5);
        System.out.println("Menor na linha 5: " + menorLinha5);
        System.out.println("\nMaior na coluna 7: " + maiorColuna7);
        System.out.println("Menor na coluna 7: " + menorColuna7);
    }
}