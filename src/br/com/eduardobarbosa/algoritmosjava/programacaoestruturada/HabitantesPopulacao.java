package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class HabitantesPopulacao {

    public static void main(String[] args) {

        // Supondo que a população de um país A seja da ordem de 80.000 habitantes
        // com uma taxa anual de crescimento de 3% e que a população de B seja 200.000 habitantes
        // com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos
        // necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

        // Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento inicias.
        // Valide a entrada e permita repetir a operação.

        Scanner sc = new Scanner(System.in);
        boolean repetirOperacao = true;

        while (repetirOperacao) {

            System.out.print("Digite a quantidade de habitantes da população A: ");
            int populacaoA = sc.nextInt();

            System.out.print("Digite a taxa de crescimento anual da população A (apenas números): ");
            float taxaCrescimentoAnualA = sc.nextFloat();

            System.out.print("Digite a quantidade de habitantes da população B: ");
            int populacaoB = sc.nextInt();

            System.out.print("Digite a taxa de crescimento anual da população B (apenas números): ");
            float taxaCrescimentoAnualB = sc.nextFloat();

            int anos = 0;

            System.out.println("Taxa Pop.A: " + taxaCrescimentoAnualA + "% | Taxa Pop.B: " + taxaCrescimentoAnualB + "%");

            while (populacaoA < populacaoB) {
                anos++;
                populacaoA += ((populacaoA * taxaCrescimentoAnualA) / 100);
                populacaoB += ((populacaoB * taxaCrescimentoAnualB) / 100);

                System.out.println(anos + "º ano: Pop. A: " + populacaoA + " hab. | Pop. B: " + populacaoB + " hab.");
            }

            System.out.print("Deseja repetir a operação? (S/N): ");
            String dgtRepetirOperacao = sc.next();

            repetirOperacao = dgtRepetirOperacao.equalsIgnoreCase("S");
        }
    }
}