package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class CalculoPotencia {

    // Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
    // número elevado ao segundo número. Não utilize a função de potência da linguagem.

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

        System.out.println("O resultado é: " + resultado);
    }
}
