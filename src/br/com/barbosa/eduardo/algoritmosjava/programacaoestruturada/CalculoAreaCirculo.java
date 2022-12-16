package br.com.barbosa.eduardo.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class CalculoAreaCirculo {

    // Desafio: Fazer um programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.

    public static void main(String[] args) {

        double raio, area;
        final double pi = Math.PI;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do c�rculo: ");
        raio = sc.nextDouble();

        area = ((raio * raio) * pi);

        System.out.println("A �rea do c�rculo � " + area);

    }
}
