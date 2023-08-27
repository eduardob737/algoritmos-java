package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class NumerosEmIntervalo {

    // 10. Fa�a um programa que recebe dois n�meros inteiros e gere os n�meros inteiros que est�o no
    // intervalo compreendidos por eles.

    // 11. Altere o programa anterior para mostrar o final a soma dos n�meros.
    public static void main(String[] args) {

        int n1, n2, soma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        n2 = sc.nextInt();

        System.out.println("N�meros entre " + n1 + " e " + n2 + ": ");

        soma = n1 + n2;

        for (int i= n1 + 1; i < n2; i++){
            System.out.println(i + " ");
            soma += i;
        }

        System.out.println("Soma total: " + soma);
    }
}
