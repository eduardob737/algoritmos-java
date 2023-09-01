package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class ListaNumerosPrimos {

    // Fa�a um programa que gera uma lista dos n�meros primos existentes entre 1 e um n�mero inteiro informado pelo usu�rio

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        boolean primo;

        System.out.print("Digite um n�mero inteiro: ");
        numero = sc.nextInt();

        System.out.print("\nN�meros primos entre 1 e " + numero + ": ");

        for (int dividendo = 1; dividendo <= numero; dividendo++) {
            primo = true;

            for (int divisor = 2; divisor < dividendo; divisor++) {
                if (dividendo % divisor == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                if (dividendo != 1) {
                    System.out.print(", " + dividendo);
                } else {
                    System.out.print(dividendo);
                }
            }
        }
    }
}

