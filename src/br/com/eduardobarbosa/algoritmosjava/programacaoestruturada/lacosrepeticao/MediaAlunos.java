package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAlunos {

    // Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas
    // e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int turmas, alunos = 0, totalAlunos = 0;
        float media;
        boolean invalido;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de turmas: ");
        turmas = sc.nextInt();

        for (int i = 1; i <= turmas; i++) {
            invalido = true;

            do {
                System.out.print("Digite a quantidade de alunos da turma: ");
                alunos = sc.nextInt();

                if (alunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("O número máximo de alunos por turmas é de 40, tente novamente.");
                }
            } while (invalido);

            totalAlunos = totalAlunos + alunos;
        }

        media = (float) totalAlunos / turmas;

        System.out.println("\nMédia de alunos por turma: " + df.format(media));

    }
}
