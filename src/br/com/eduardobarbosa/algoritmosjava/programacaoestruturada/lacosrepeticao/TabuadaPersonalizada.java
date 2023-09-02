package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class TabuadaPersonalizada {

    // Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que ser� digitado pelo usu�rio,
    // tabuada n�o deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados
    // tamb�m pelo usu�rio, conforme exemplo abaixo:
    // Montar a tabuada do: 5
    // Come�ar por: 4
    // Terminar em: 7
    // Obs: Validar se o valor final digitado n�o � menor do que o inicial.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero, inicio, fim, produto;
        boolean entradaInvalida;

        System.out.print("Montar a tabuada do: ");
        numero = sc.nextInt();

        do {
        entradaInvalida = false;

        System.out.print("Come�ar por: ");
        inicio = sc.nextInt();

        System.out.print("Terminar em: ");
        fim = sc.nextInt();

        if (fim < inicio){
            System.out.println("Valor final menor do que valor inicial, tente novamente.");
            entradaInvalida = true;
        }

        } while (entradaInvalida);

        System.out.println("\nTabuada do " + numero);
        System.out.println("Come�ando em " + inicio);
        System.out.println("Terminando em " + fim + "\n");

        for(int i = inicio; i <= fim; i++){
            produto = numero * i;
            System.out.println(numero + " x " + i + " = " + produto);
        }
    }
}
