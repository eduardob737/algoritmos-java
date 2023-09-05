package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.util.Scanner;

public class CalculoAreaCirculo {

    // Desafio: Fazer um programa que peça o raio de um círculo, calcule e mostre sua área.

    public static void main(String[] args) {

        double raio, area;
        final double pi = Math.PI;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = ((raio * raio) * pi);

        System.out.println("A área do círculo é " + area);

    }
}
