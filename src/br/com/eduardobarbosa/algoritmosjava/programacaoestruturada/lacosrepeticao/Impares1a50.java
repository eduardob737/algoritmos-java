package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

public class Impares1a50 {

    // Fa�a um programa que imprima na tela apenas os n�meros �mpares entre 1 a 50.
    public static void main(String[] args) {

        for (int i=0; i<=50; i++){
            if (i % 2 != 0)
                System.out.println(i + " ");
        }

    }
}