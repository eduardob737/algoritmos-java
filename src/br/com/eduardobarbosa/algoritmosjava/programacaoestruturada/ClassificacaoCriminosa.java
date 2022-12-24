package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class ClassificacaoCriminosa {

    // Faça um programa que faca 5 perguntas para uma pessoa sobre um crime.
    // As perguntas sao:
    //  A. “Telefonou para a vitima?"
    //  B. "Esteve no local do crime?"
    //  C. “Mora perto da vitima?"
    //  D. “Devia para a vitima?"
    //  E. "Ja trabalhou com a vitima?"
    // O programa deve no final emitir uma classificagéo sobre a participacao da pessoa no crime.
    // Se a pessoa responder positivamente a 2 questoes ela deve ser classificada como "Suspeita",
    // entre 3 e 4 como "Cumplice" e 5 como "Assassino". Caso contrario, ele sera classificado como "Inocente".

    public static void main(String[] args) {

        String[] respostas = new String[5];
        int contador = 0;
        String classificao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Responda as perguntas com S para Sim ou N para Não:");

        System.out.print("\nTelefonou para a vitima? (S/N): ");
        respostas[0] = sc.nextLine();

        System.out.print("Esteve no local do crime? (S/N): ");
        respostas[1] = sc.nextLine();

        System.out.print("Mora perto da vitima? (S/N): ");
        respostas[2] = sc.nextLine();

        System.out.print("Devia para a vitima? (S/N): ");
        respostas[3] = sc.nextLine();

        System.out.print("Ja trabalhou com a vitima? (S/N): ");
        respostas[4] = sc.nextLine();

        for (String resposta : respostas) {
            if (resposta.equalsIgnoreCase("S")) {
                contador++;
            }
        }

        classificao = switch (contador) {
            case 2 -> "Suspeito(a)";
            case 3, 4 -> "Cúmplice";
            case 5 -> "Assassino(a)";
            default -> "Inocente";
        };

        System.out.println("\nSua classificação é de: " + classificao);

    }
}
