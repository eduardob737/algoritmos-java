package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class Fatorial {

    // Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, fatorial;

        System.out.print("Digite o número que deseja o fatorial: ");
        num = sc.nextInt();

        fatorial = num;

        for (int i= num-1; i >= 1; i--){
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + num + ": " + fatorial);
    }
}
