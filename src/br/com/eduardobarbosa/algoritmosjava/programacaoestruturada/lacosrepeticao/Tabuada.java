package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;
public class Tabuada {

    // Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
    // O usu�rio deve informar de qual n�mero ele deseja ver a tabuada. A sa�da deve ser conforme o exemplo abaixo:
    // Tabuada de 5:
    // 5 x 1 = 5
    // ...
    // 5 x 10 = 50

    public static void main(String[] args) {

        int num, produto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o n�mero que deseja a tabuada: ");
        num = sc.nextInt();

        for (int i = 0; i<=10; i++){
            produto = num * i;
            System.out.println(num + " x " + i + " = " + produto);
        }
    }
}
