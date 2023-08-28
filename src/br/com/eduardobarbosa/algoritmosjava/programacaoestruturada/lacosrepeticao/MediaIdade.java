package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaIdade {

    // Fa�a um programa que pe�a para n pessoas a sua idade, ao final o programa devera verificar se a m�dia
    // de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e ent�o, dizer se a turma � jovem, adulta,
    // ou idosa, conforme a m�dia calculada.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtd, idade = 0;
        float media;
        String classificacao;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de pessoas: ");
        qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Digite a idade: ");
            idade = idade + sc.nextInt();
        }

        media = (float) idade / qtd;

        if (media <= 25) {
            classificacao = "Jovem";
        } else if (media <= 60) {
            classificacao = "Adulta";
        } else {
            classificacao = "Idosa";
        }

        System.out.println("\nM�dia de idade da turma: " + df.format(media));
        System.out.println("Classifica��o et�ria: " + classificacao);
    }
}
