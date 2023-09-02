package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class SalarioFuncionario {
    // Um funcionário de uma empresa recebe aumento salarial anualmente:
    // Sabe-se que:
    // Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
    // a) Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
    // b) A partir de 1997 (inclusive), os aumentos salarias sempre correspondem ao dobro do percentual do ano anterior.
    // Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo
    // que o usuário digite o salário inicial, ano de contratação, ano atual e percentual de aumento do funcionário.

    public static void main(String[] args) {

        float salarioInicial, salarioAtual;
        int anoInicial, anoAtual;
        float percentualAumento, valorAumento;

        System.out.print("Digite o ano de contratação: ");
        anoInicial = Utils.scanner.nextInt();

        System.out.print("Digite o salário inicial: ");
        salarioInicial = Utils.scanner.nextInt();

        System.out.print("Digite o percentual de aumento após o ano inicial: ");
        percentualAumento = Utils.scanner.nextFloat() / 100;

        System.out.print("Digite o ano atual: ");
        anoAtual = Utils.scanner.nextInt();

        salarioAtual = salarioInicial;

        System.out.println("\nSalário em " + anoInicial + ": R$ " + Utils.mask.format(salarioInicial));

        for (int ano = anoInicial + 1; ano <= anoAtual; ano++){
            valorAumento = salarioAtual * percentualAumento;
            salarioAtual += valorAumento;

            System.out.println("Salário em " + ano + ": R$ " + Utils.mask.format(salarioAtual) +
                    " -> Aumento de R$ " + Utils.mask.format(valorAumento) +
                    " (" + Utils.mask.format(percentualAumento * 100) +
                    "%)");

            percentualAumento *= 2;
        }
    }
}
