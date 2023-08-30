package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class NumerosPrimos {

    // Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo.
    // Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo = true;

        System.out.print("Digite um n�mero inteiro: ");
        num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        System.out.println(primo ? num + " � primo" : num + " n�o � primo");
    }
}
