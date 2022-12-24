package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class VerificadorTriangulo {

    // Faça um Programa que peça os 3 lados de um triângulo. o programa deverá informar
    // se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo,
    // se o mesmo é: equilátero, isósceles ou escaleno. Dicas: Três lados formam um triângulo
    // quando a soma de quaisquer dois lados for maior que o terceiro;
    //         Triângulo Equilátero: três lados iguais;
    //         Triângulo Isósceles: quaisquer dois lados iguais;
    //         Triângulo Escaleno: três lados diferentes;

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
            System.out.println("Triângulo " + verificaTipoTriangulo(lado1, lado2, lado3));
        } else {
            System.out.println("Não é um triângulo.");
        }
    }

    public static String verificaTipoTriangulo (float lado1, float lado2, float lado3){
        if (lado1 == lado2 && lado2 == lado3){
            tipoTriangulo = "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            tipoTriangulo = "Isósceles";
        } else {
            tipoTriangulo = "Escaleno";
        }
        return tipoTriangulo;
    }
}
