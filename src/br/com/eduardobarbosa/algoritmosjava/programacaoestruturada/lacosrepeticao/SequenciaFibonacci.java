package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class SequenciaFibonacci {

    // 15. A s�rie de Fibonacci � formada pela sequ�ncia 0, 1,1,2,3,5,8,13,21,34,55,..
    // Fa�a um programa capaz de gerar a s�rie at� o n-�simo termo.
    // 16. Fa�a um programa de Fibonacci que gere a s�rie at�  que o valor seja maior que 500.

    public static void main(String[] args) {

        int nTermos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o n-�simo termo: ");
        nTermos = sc.nextInt();

        int[] sequencia = new int[nTermos];
        sequencia[0] = 0;
        sequencia[1] = 1;

        System.out.print(sequencia[0] + ", " + sequencia[1]);

        for (int i=2; i<nTermos; i++){
            sequencia[i] = sequencia[i-1] + sequencia[i-2];
            System.out.print(", " + sequencia[i]);
        }

    }
}
