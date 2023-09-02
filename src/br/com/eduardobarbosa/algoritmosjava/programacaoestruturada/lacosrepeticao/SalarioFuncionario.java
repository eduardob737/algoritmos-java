package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class SalarioFuncionario {
    // Um funcion�rio de uma empresa recebe aumento salarial anualmente:
    // Sabe-se que:
    // Esse funcion�rio foi contratado em 1995, com sal�rio inicial de R$ 1.000,00;
    // a) Em 1996 recebeu aumento de 1,5% sobre seu sal�rio inicial;
    // b) A partir de 1997 (inclusive), os aumentos salarias sempre correspondem ao dobro do percentual do ano anterior.
    // Fa�a um programa que determine o sal�rio atual desse funcion�rio. Ap�s concluir isto, altere o programa permitindo
    // que o usu�rio digite o sal�rio inicial, ano de contrata��o, ano atual e percentual de aumento do funcion�rio.

    public static void main(String[] args) {

        float salarioInicial, salarioAtual;
        int anoInicial, anoAtual;
        float percentualAumento, valorAumento;

        System.out.print("Digite o ano de contrata��o: ");
        anoInicial = Utils.scanner.nextInt();

        System.out.print("Digite o sal�rio inicial: ");
        salarioInicial = Utils.scanner.nextInt();

        System.out.print("Digite o percentual de aumento ap�s o ano inicial: ");
        percentualAumento = Utils.scanner.nextFloat() / 100;

        System.out.print("Digite o ano atual: ");
        anoAtual = Utils.scanner.nextInt();

        salarioAtual = salarioInicial;

        System.out.println("\nSal�rio em " + anoInicial + ": R$ " + Utils.mask.format(salarioInicial));

        for (int ano = anoInicial + 1; ano <= anoAtual; ano++){
            valorAumento = salarioAtual * percentualAumento;
            salarioAtual += valorAumento;

            System.out.println("Sal�rio em " + ano + ": R$ " + Utils.mask.format(salarioAtual) +
                    " -> Aumento de R$ " + Utils.mask.format(valorAumento) +
                    " (" + Utils.mask.format(percentualAumento * 100) +
                    "%)");

            percentualAumento *= 2;
        }
    }
}
