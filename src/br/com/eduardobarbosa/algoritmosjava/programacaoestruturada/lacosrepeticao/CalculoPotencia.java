package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class CalculoPotencia {

    // Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o primeiro
    // n�mero elevado ao segundo n�mero. N�o utilize a fun��o de pot�ncia da linguagem.

    public static void main(String[] args) {

        int base, expoente, resultado = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base: ");
        base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        expoente = sc.nextInt();

        for (int i=1; i <= expoente; i++){
            resultado *= base;
        }

        System.out.println("O resultado �: " + resultado);
    }
}
