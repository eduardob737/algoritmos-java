package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoFruteira {

    // Uma fruteira esta vendendo frutas com a seguinte tabela de preços:
    //              Até 5 Kg        Acima de 5 Kg
    // Morango   R$ 2,50 por Kg      R$ 2,20 por Kg
    // Maçã      R$ 1,80 por Kg      R$ 1,50 por Kg
    // Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
    // ultrapassar R$ 25,00, recebera ainda um desconto de 10% sobre este total.
    // Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
    // (em Kg) de maçãs adquiridas e escreva o valor a ser pago pelo cliente.

    public static void main(String[] args) {

        float qtdMorangos, qtdMacas, precoKgMorango, precoKgMaca, valorMorangos, valorMacas, valorTotal, desconto = 0;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de morangos (em kg): ");
        qtdMorangos = sc.nextFloat();

        System.out.print("Digite a quantidade de maças (em kg): ");
        qtdMacas = sc.nextFloat();

        if (qtdMorangos <= 5){
            precoKgMorango = 2.50f;
        } else {
            precoKgMorango = 2.20f;
        }

        if (qtdMacas <= 5){
            precoKgMaca = 1.80f;
        } else {
            precoKgMaca = 1.50f;
        }

        valorMorangos = qtdMorangos * precoKgMorango;
        valorMacas = qtdMacas * precoKgMaca;
        valorTotal = valorMorangos + valorMacas;

        if ((qtdMorangos + qtdMacas > 8.0f) || (valorTotal > 25.0f)){
            desconto = valorTotal * 0.10f;
            valorTotal = valorTotal - desconto;
        }

        System.out.println("\nValor dos morangos: R$ " + df.format(valorMorangos));
        System.out.println("Valor das maçãs: R$ " + df.format(valorMacas));
        System.out.println("Desconto: R$ " + df.format(desconto));
        System.out.println("Valor total: R$ " + df.format(valorTotal));
    }
}
