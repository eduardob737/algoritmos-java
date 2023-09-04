package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class SerieDeTermos {

    // Faça um programa que mostre os n termos da séria a seguir:
    // S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
    // Imprima no final a soma da série.

    public static void main(String[] args) {

        int numeroTermos;
        float soma = 0;

        System.out.print("Digite o número de termos: ");
        numeroTermos = Utils.scanner.nextInt();

        System.out.print("S = ");

        for (int n = 1, m = 1; n <= numeroTermos; n++, m += 2) {
            if (n == 1) {
                System.out.print(n + "/" + m);
            } else {
                System.out.print(" + " + n + "/" + m);
            }

            soma += (float) n /m;
        }

        System.out.println(" = " + Utils.mask.format(soma));
    }

}