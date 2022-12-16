package br.com.barbosa.eduardo.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class CalculoAreaQuadrado {

    // Desafio: Fazer um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário

    public static void main(String[] args) {

        float largura, area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        largura = sc.nextFloat();

        area = largura * largura;

        System.out.println("A área do quadrado é " + area);
        System.out.println("O dobro da área do quadrado é " + area * 2);

    }
}
