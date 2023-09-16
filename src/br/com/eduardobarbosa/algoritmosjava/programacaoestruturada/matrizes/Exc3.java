package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.matrizes;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc3 {
    // Capture do teclado valores para preenchimento de uma matriz M 3x3.
    // Após a captura imprima a matriz criada e encontre a quantidade de
    // números pares, a quantidade de números ímpares.

    public static void main(String[] args) {

        int[][] matrizM = new int[3][3];
        int[] pares, impares;
        int ultPosPar = 0, ultPosImp = 0;
        int qtdPar = 0, qtdImp = 0;

        for (int i = 0; i < matrizM.length; i++){
            for (int j = 0; j < matrizM[i].length; j++){
                System.out.print("Digite um número: ");
                matrizM[i][j] = Utils.scanner.nextInt();
            }
        }

        System.out.println("\nVetor M: ");

        for (int[] linha : matrizM) {
            for (int j = 0; j < linha.length; j++) {
                if (j == 0) {
                    System.out.print(linha[j]);
                } else {
                    System.out.print(", " + linha[j]);
                }
            }
            System.out.println();
        }

        for (int[] linha : matrizM) {
            for (int i : linha) {
                if (i % 2 == 0) {
                    qtdPar++;
                } else {
                    qtdImp++;
                }
            }
        }

        pares = new int[qtdPar];
        impares = new int[qtdImp];

        for (int[] linha : matrizM) {
            for (int i : linha) {
                if (i % 2 == 0) {
                    pares[ultPosPar] = i;
                    ultPosPar++;
                } else {
                    impares[ultPosImp] = i;
                    ultPosImp++;
                }
            }
        }

        System.out.println("\n" + pares.length + " números pares: ");

        for (int par : pares){
            System.out.print(par + " ");
        }

        System.out.println("\n\n" + impares.length + " números ímpares: ");

        for (int impar : impares){
            System.out.print(impar + " ");
        }
    }
}