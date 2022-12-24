package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoTempoDownload {

    // Desafio: Faça um programa que peça o tamanho de um arquivo para download (em MB)
    // e a velocidade de um link de internet (em Mbps), calcule e informe o tempo aproximado
    // de download do arquivo usando este link (em minutos).

    public static void main(String[] args) {

        float tamanhoArquivo, velocidadeLink, tempoDownload;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        tamanhoArquivo = sc.nextFloat();

        System.out.print("Digite a velocidade de um link de internet (em Mbps): ");
        velocidadeLink = sc.nextFloat();

        tempoDownload = (tamanhoArquivo / velocidadeLink) / 60;

        System.out.println("\nO tempo aproximado para o download do arquivo é de " + df.format(tempoDownload) + " minutos");

    }
}
