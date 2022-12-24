package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class ConversaoFarenheitCelsius {

    // Desafio: Fazer um programa que peça a temperatura em graus Farenheit, transforme e mostre
    //  a temperatura em graus Celsius.

    public static void main(String[] args) {

        float temperaturaFarenheit, temperaturaCelsius;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Farenheit: ");
        temperaturaFarenheit = sc.nextFloat();

        temperaturaCelsius = (5 * (temperaturaFarenheit-32) / 9);

        System.out.println("A temperatura convertida é de " + temperaturaCelsius + " graus Celsius.");

    }
}
