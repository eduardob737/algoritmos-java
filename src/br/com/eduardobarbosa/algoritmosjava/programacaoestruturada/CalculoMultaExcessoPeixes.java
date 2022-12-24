package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoMultaExcessoPeixes {

    // João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
    // rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior
    // que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
    // deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça
    // um programa que leia a variável peso (peso de peixes) e verifique se há excesso.
    // Se houver, gravar na variável excesso e na variável multa o valor da multa que
    // João deverá pagar Caso contrário mostrar tais variáveis com o conteúdo ZERO.

    public static void main(String[] args) {

        float pesoPeixes;
        float excesso = 0f;
        float multa = 0f;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o peso de peixes: ");
        pesoPeixes = sc.nextFloat();

        if (pesoPeixes > 50.0f){
            excesso = pesoPeixes - 50.00f;
            multa = excesso * 4.0f;
        }

        System.out.println("Peso total de peixes: " + pesoPeixes + "kg");
        System.out.println("Peso excessivo: " + df.format(excesso) + "kg");
        System.out.println("Multa: R$ " + df.format(multa));

    }
}
