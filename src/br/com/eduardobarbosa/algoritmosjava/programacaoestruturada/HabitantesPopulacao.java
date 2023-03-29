package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class HabitantesPopulacao {

    public static void main(String[] args) {

        // Supondo que a popula��o de um pa�s A seja da ordem de 80.000 habitantes
        // com uma taxa anual de crescimento de 3% e que a popula��o de B seja 200.000 habitantes
        // com uma taxa de crescimento de 1.5%. Fa�a um programa que calcule e escreva o n�mero de anos
        // necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.

        // Altere o programa anterior permitindo ao usu�rio informar as popula��es e as taxas de crescimento inicias.
        // Valide a entrada e permita repetir a opera��o.

        Scanner sc = new Scanner(System.in);
        boolean repetirOperacao = true;

        while (repetirOperacao) {

            System.out.print("Digite a quantidade de habitantes da popula��o A: ");
            int populacaoA = sc.nextInt();

            System.out.print("Digite a taxa de crescimento anual da popula��o A (apenas n�meros): ");
            float taxaCrescimentoAnualA = sc.nextFloat();

            System.out.print("Digite a quantidade de habitantes da popula��o B: ");
            int populacaoB = sc.nextInt();

            System.out.print("Digite a taxa de crescimento anual da popula��o B (apenas n�meros): ");
            float taxaCrescimentoAnualB = sc.nextFloat();

            int anos = 0;

            System.out.println("Taxa Pop.A: " + taxaCrescimentoAnualA + "% | Taxa Pop.B: " + taxaCrescimentoAnualB + "%");

            while (populacaoA < populacaoB) {
                anos++;
                populacaoA += ((populacaoA * taxaCrescimentoAnualA) / 100);
                populacaoB += ((populacaoB * taxaCrescimentoAnualB) / 100);

                System.out.println(anos + "� ano: Pop. A: " + populacaoA + " hab. | Pop. B: " + populacaoB + " hab.");
            }

            System.out.print("Deseja repetir a opera��o? (S/N): ");
            String dgtRepetirOperacao = sc.next();

            repetirOperacao = dgtRepetirOperacao.equalsIgnoreCase("S");
        }
    }
}