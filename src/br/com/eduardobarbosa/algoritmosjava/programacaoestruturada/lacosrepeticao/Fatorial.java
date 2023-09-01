package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class Fatorial {

    // Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio
    // Sa�da:
    // Fatorial de 5
    // 5! = 5.4.3.2.1 = 120

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, fatorial;

        System.out.print("Digite o n�mero que deseja o fatorial: ");
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
