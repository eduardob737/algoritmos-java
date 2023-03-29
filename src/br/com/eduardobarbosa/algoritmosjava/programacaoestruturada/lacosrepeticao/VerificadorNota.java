package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class VerificadorNota {
    // Faca um programa que peca uma nota, entre zero e dez. Mostre uma
    // mensagem caso o valor seja invalido e continue pedindo até que o
    // usuario informe um valor valido.

    public static void main(String[] args) {

        int nota = -1;

        Scanner sc = new Scanner(System.in);

        while (nota < 0 || nota > 10) {
            System.out.print("Digite uma nota de 0 a 10: ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido");
            } else {
                System.out.println("Valor válido");
            }
        }

    }
}
