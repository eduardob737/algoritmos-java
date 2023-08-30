package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class NumerosPrimos {

    // Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
    // Um número primo é aquele que é divisível somente por ele mesmo e por 1.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo = true;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        System.out.println(primo ? num + " é primo" : num + " não é primo");
    }
}
