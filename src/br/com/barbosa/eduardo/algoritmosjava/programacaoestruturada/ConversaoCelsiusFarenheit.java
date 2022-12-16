package br.com.barbosa.eduardo.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class ConversaoCelsiusFarenheit {

    // Desafio: Fazer um programa que peça a temperatura em graus Celsius, transforme e mostre
    //  a temperatura em graus Farenheit.

    public static void main(String[] args) {

        float temperaturaFarenheit, temperaturaCelsius;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        temperaturaCelsius = sc.nextFloat();

        temperaturaFarenheit = (temperaturaCelsius / 5 * 9 + 32);

        System.out.println("A temperatura convertida é de " + temperaturaFarenheit + " graus Farenheit.");


    }
}
