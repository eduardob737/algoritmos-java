package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class MaiorDe5 {

    // 6. Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
    // 7. Fa�a um programa que leia 5 n�meros e informe a soma e m�dia dos n�meros.
    public static void main(String[] args) {

        float maior = Integer.MIN_VALUE, soma = 0, media;
        float num;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um n�mero: ");
            num = sc.nextFloat();

            if (num > maior) {
                maior = num;
                System.out.println("O maior mudou: " + maior);
            }
            soma += num;
        }

        media = soma / 5;

        System.out.println("O maior n�mero �: " + maior);
        System.out.println("A soma dos n�meros digitados �: " + soma);
        System.out.println("A m�dia dos n�meros digitados �: " + media);

    }
}
