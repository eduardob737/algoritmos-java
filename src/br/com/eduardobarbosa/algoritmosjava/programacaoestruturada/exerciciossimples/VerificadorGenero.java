package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.util.Scanner;

public class VerificadorGenero {

    // Desafio: Fazer um programa que verifique se uma letra digitada é F ou M.
    // Conforme a letra escrever: F - Feminino, M - Masculino ou Sexo inválido.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = sc.nextLine().toUpperCase();

        switch (letra) {
            case "F" -> System.out.println("F - Feminino");
            case "M" -> System.out.println("M - Masculino");
            default -> System.out.println("Sexo inválido");
        }
    }
}
