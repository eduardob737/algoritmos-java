package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class MaiorDe5 {

    // 6. Faça um programa que leia 5 números e informe o maior número.
    // 7. Faça um programa que leia 5 números e informe a soma e média dos números.
    public static void main(String[] args) {

        float maior = Integer.MIN_VALUE, soma = 0, media;
        float num;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextFloat();

            if (num > maior) {
                maior = num;
                System.out.println("O maior mudou: " + maior);
            }
            soma += num;
        }

        media = soma / 5;

        System.out.println("O maior número é: " + maior);
        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A média dos números digitados é: " + media);

    }
}
