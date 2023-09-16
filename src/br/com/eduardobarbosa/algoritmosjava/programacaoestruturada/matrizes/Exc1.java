package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.matrizes;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc1 {
    // Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.
    // Após isso determine o maior número da matriz e a sua posição (linha, coluna).

    public static void main(String[] args) {

        int[][] matrizM = new int[4][4];
        int[] maior = new int[3];
        maior[0] = Integer.MIN_VALUE;

        System.out.println("Matriz M: ");

        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j < matrizM[i].length; j++){
                matrizM[i][j] = Utils.random.nextInt(101);

                if (j == 0){
                    System.out.print(matrizM[i][j]);
                } else {
                    System.out.print(", " + matrizM[i][j]);
                }

                if (matrizM[i][j] > maior[0]) {
                    maior[0] = matrizM[i][j];
                    maior[1] = i;
                    maior[2] = j;
                }
            }
            System.out.println();
        }

        System.out.println("\nMaior número: " + maior[0] + " (Linha " + maior[1] + " coluna " + maior[2] + ")");
    }
}
