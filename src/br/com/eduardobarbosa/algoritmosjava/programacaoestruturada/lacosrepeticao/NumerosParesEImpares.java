package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class NumerosParesEImpares {

    // Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade
    // de números pares e qtd de números ímpares.

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int pares = 0, impares = 0;
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<10; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0)
                pares++;
            else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}