package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class NumerosPrimos {

    // Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
    // Um número primo é aquele que é divisível somente por ele mesmo e por 1.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        if ((num % 2 != 0) && (num % 3 != 0)) {
            System.out.println(num + " é número primo.");
        } else {
            System.out.println(num + " não é número primo.");
        }
    }
}
