package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.util.Scanner;

public class VerificadoAnoBissexto {

    // Fa�a um Programa que pe�a um n�mero correspondente a um
    // determinado ano e em seguida informe se este ano � ou n�o bissexto.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println(ano + " � bissexto");
        } else {
            System.out.println(ano + " n�o � bissexto");
        }
    }
}
