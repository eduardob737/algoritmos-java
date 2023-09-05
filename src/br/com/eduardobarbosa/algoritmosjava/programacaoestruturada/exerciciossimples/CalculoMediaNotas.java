package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.util.Scanner;

public class CalculoMediaNotas {

    // Desafio: Fazer um programa que peça as 4 notas de aluno e calcule a média

    public static void main(String[] args) {

        float nota1, nota2, nota3, nota4, media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextFloat();

        System.out.print("Digite a quarta nota: ");
        nota4 = sc.nextFloat();

        media = ((nota1 + nota2 + nota3 + nota4) / 4);

        System.out.println("A média é: " + media);

    }
}
