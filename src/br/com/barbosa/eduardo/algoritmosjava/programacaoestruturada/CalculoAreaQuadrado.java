package br.com.barbosa.eduardo.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class CalculoAreaQuadrado {

    // Desafio: Fazer um programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio

    public static void main(String[] args) {

        float largura, area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        largura = sc.nextFloat();

        area = largura * largura;

        System.out.println("A �rea do quadrado � " + area);
        System.out.println("O dobro da �rea do quadrado � " + area * 2);

    }
}
