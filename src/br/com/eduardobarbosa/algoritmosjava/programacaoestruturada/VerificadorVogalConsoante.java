package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class VerificadorVogalConsoante {

    // Desafio: Fazer um programa que verifique se uma letra digitada é vogal ou consoante.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = sc.nextLine().toUpperCase();

        switch (letra) {
            case "A", "E", "I", "O", "U" -> System.out.println("A letra digitada é uma vogal.");
            default -> System.out.println("A letra digitada é uma consoante.");
        }
    }
}
