package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class SequenciaFibonacci {

    // 15. A série de Fibonacci é formada pela sequência 0, 1,1,2,3,5,8,13,21,34,55,..
    // Faça um programa capaz de gerar a série até o n-ésimo termo.
    // 16. Faça um programa de Fibonacci que gere a série até  que o valor seja maior que 500.

    public static void main(String[] args) {

        int nTermos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o n-ésimo termo: ");
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
