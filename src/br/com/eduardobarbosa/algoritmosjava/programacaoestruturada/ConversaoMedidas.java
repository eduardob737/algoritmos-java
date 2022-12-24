package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class ConversaoMedidas {

    // Desafio: Fazer um programa que converta metros para centímetros

    public static void main(String[] args) {

        float metros, centimetros;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida em metros: ");
        metros = sc.nextFloat();

        centimetros = metros * 100;

        System.out.println(metros + " metro(s) equivale(m) a " + centimetros + " centímetros.");
    }
}
