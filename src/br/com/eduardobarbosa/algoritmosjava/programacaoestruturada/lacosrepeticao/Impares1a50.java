package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

public class Impares1a50 {

    // Faça um programa que imprima na tela apenas os números ímpares entre 1 a 50.
    public static void main(String[] args) {

        for (int i=0; i<=50; i++){
            if (i % 2 != 0)
                System.out.println(i + " ");
        }

    }
}