package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoPesoIdeal {

    // Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule
    // seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

    public static void main(String[] args) {

        float altura, pesoIdeal;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite sua altura: ");
        altura = sc.nextFloat();

        pesoIdeal = (72.7f * altura) - 58;

        System.out.println("Seu peso ideal é de " + df.format(pesoIdeal) + "kg");
    }
}
