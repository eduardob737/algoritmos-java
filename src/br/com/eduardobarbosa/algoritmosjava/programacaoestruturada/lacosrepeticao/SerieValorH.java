package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class SerieValorH {

    // Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, faça um programa que calcule o valor de H com N termos.

    public static void main(String[] args) {

        final int DIVIDENDO = 1;
        int numeroTermos;
        float soma = 1;

        System.out.print("Digite o número de termos: ");
        numeroTermos = Utils.scanner.nextInt();

        System.out.print("H = " + DIVIDENDO);

        for (int divisor = 2; divisor <= numeroTermos; divisor++){
            System.out.print(" + " + DIVIDENDO + "/" + divisor);
            soma += (float) DIVIDENDO / divisor;
        }

        System.out.print(" = " + Utils.mask.format(soma));
    }
}
