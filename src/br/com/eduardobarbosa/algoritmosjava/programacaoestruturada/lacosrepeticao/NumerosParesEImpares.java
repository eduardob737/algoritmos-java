package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class NumerosParesEImpares {

    // Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade
    // de n�meros pares e qtd de n�meros �mpares.

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int pares = 0, impares = 0;
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<10; i++){
            System.out.print("Digite um n�mero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0)
                pares++;
            else {
                impares++;
            }
        }

        System.out.println("Quantidade de n�meros pares: " + pares);
        System.out.println("Quantidade de n�meros �mpares: " + impares);
    }
}