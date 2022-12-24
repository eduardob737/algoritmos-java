package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class VerificadorTriangulo {

    // Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. o programa dever� informar
    // se os valores podem ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo,
    // se o mesmo �: equil�tero, is�sceles ou escaleno. Dicas: Tr�s lados formam um tri�ngulo
    // quando a soma de quaisquer dois lados for maior que o terceiro;
    //         Tri�ngulo Equil�tero: tr�s lados iguais;
    //         Tri�ngulo Is�sceles: quaisquer dois lados iguais;
    //         Tri�ngulo Escaleno: tr�s lados diferentes;

    static String tipoTriangulo;

    public static void main(String[] args) {

        float lado1, lado2, lado3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        lado1 = sc.nextFloat();

        System.out.print("Digite o lado 2: ");
        lado2 = sc.nextFloat();

        System.out.print("Digite o lado 3: ");
        lado3 = sc.nextFloat();

        if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1){
            System.out.println("Tri�ngulo " + verificaTipoTriangulo(lado1, lado2, lado3));
        } else {
            System.out.println("N�o � um tri�ngulo.");
        }
    }

    public static String verificaTipoTriangulo (float lado1, float lado2, float lado3){
        if (lado1 == lado2 && lado2 == lado3){
            tipoTriangulo = "Equil�tero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            tipoTriangulo = "Is�sceles";
        } else {
            tipoTriangulo = "Escaleno";
        }
        return tipoTriangulo;
    }
}
