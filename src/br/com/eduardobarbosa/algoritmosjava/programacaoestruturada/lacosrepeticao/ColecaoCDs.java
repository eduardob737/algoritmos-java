package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ColecaoCDs {

    // Faça um programa que calcule o valor total investido por um colecionador em sua coleção
    // de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs
    // e o valor para em cada um.

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        int quantidadeCDs;
        float valor = 0, media;

        System.out.print("Digite a quantidade de CDs: ");
        quantidadeCDs = sc.nextInt();

        for (int i=0; i < quantidadeCDs; i++){
            System.out.print("Digite o valor do CD: ");
            valor = valor + sc.nextFloat();
        }

        media = valor / quantidadeCDs;

        System.out.println("\nO valor total investido foi de: " + df.format(valor));
        System.out.println("A média de preço de cada CD é de: " + df.format(media));
    }
}
