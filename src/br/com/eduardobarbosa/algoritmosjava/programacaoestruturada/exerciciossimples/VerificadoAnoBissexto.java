package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.util.Scanner;

public class VerificadoAnoBissexto {

    // Faça um Programa que peça um número correspondente a um
    // determinado ano e em seguida informe se este ano é ou não bissexto.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println(ano + " é bissexto");
        } else {
            System.out.println(ano + " não é bissexto");
        }
    }
}
