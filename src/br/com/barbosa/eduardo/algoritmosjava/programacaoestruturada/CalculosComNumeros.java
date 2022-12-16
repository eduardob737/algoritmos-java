package br.com.barbosa.eduardo.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class CalculosComNumeros {

    // Desafio: Fazer um programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
    // a) o produto do dobro do primeiro com metade do segundo
    // b) a soma do triplo do primeiro com o terceiro
    // c) o terceiro elevado ao cubo

    public static void main(String[] args) {

        int numInt1, numInt2;
        float numReal3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        numInt1 = sc.nextInt();

        System.out.print("Digite outro n�mero inteiro: ");
        numInt2 = sc.nextInt();

        System.out.print("Digite um n�mero real: ");
        numReal3 = sc.nextFloat();

        int a = (numInt1 * 2) * (numInt2 / 2);
        float b = (numInt1 * 3) + numReal3;
        double c = Math.pow(numReal3, 3);

        System.out.println("O produto do dobro do primeiro com o terceiro � " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro � " + b);
        System.out.println("O terceiro elevado ao cubo � " + c);
    }
}
