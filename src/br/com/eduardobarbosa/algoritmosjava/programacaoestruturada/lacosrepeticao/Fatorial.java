package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class Fatorial {

    // Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
    // Saída:
    // Fatorial de 5
    // 5! = 5.4.3.2.1 = 120

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, fatorial;

        System.out.print("Digite o número que deseja o fatorial: ");
        num = sc.nextInt();

        fatorial = num;

        System.out.println("\nFatorial de " + num);
        System.out.print(num + "! = " + num);

        for (int i= num-1; i >= 1; i--){
            fatorial *= i;
            System.out.print("." + i);

        }

        System.out.println(" = " + fatorial);
    }
}
