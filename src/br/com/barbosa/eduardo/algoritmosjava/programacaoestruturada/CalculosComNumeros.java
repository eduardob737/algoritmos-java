package br.com.barbosa.eduardo.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class CalculosComNumeros {

    // Desafio: Fazer um programa que peça 2 números inteiros e um número real. Calcule e mostre:
    // a) o produto do dobro do primeiro com metade do segundo
    // b) a soma do triplo do primeiro com o terceiro
    // c) o terceiro elevado ao cubo

    public static void main(String[] args) {

        int numInt1, numInt2;
        float numReal3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numInt1 = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        numInt2 = sc.nextInt();

        System.out.print("Digite um número real: ");
        numReal3 = sc.nextFloat();

        int a = (numInt1 * 2) * (numInt2 / 2);
        float b = (numInt1 * 3) + numReal3;
        double c = Math.pow(numReal3, 3);

        System.out.println("O produto do dobro do primeiro com o terceiro é " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro é " + b);
        System.out.println("O terceiro elevado ao cubo é " + c);
    }
}
