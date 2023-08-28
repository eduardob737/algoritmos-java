package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAlunos {

    // Fa�a um programa que calcule o n�mero m�dio de alunos por turma. Para isto, pe�a a quantidade de turmas
    // e a quantidade de alunos para cada turma. As turmas n�o podem ter mais de 40 alunos.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int turmas, alunos, totalAlunos = 0;
        float media;
        boolean parar = false;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de turmas: ");
        turmas = sc.nextInt();

        for (int i = 1; i <= turmas; i++) {
            System.out.print("Digite a quantidade de alunos da turma: ");
            alunos = sc.nextInt();

            if (alunos > 40){
                System.out.println("O n�mero m�ximo de alunos por turmas � de 40, tente novamente.");
                parar = true;
                break;
            }
            
            totalAlunos = totalAlunos + alunos;
        }

        if (!parar){
            media = (float) totalAlunos / turmas;
            System.out.println("\nM�dia de alunos por turma: " + df.format(media));
        }
    }
}
