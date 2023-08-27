package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

public class ImpressaoNumeros {

    // Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
    // Depois modifique o programa para que ele mostre os números um ao lado do outro.
    public static void main(String[] args) {

        for (int i=1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        for (int i=1; i <= 20; i++) {
            System.out.print(i + " ");
        }

    }
}
