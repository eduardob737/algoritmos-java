package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class Fatorial {

    // Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, fatorial;

        System.out.print("Digite o n�mero que deseja o fatorial: ");
        num = sc.nextInt();

        fatorial = num;

        for (int i= num-1; i >= 1; i--){
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + num + ": " + fatorial);
    }
}
