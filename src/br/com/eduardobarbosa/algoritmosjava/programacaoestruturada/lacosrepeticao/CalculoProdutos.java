package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.text.DecimalFormat;

public class CalculoProdutos {

    // O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99, com cerca de 10 caixas.
    // Para agilizar o cálculo de quanto cada cliente deve pagar ele desenvolveu uma tabela que contém
    // o número de itens que o cliente comprou e ao lado o valor da conta. Desta forma a atendente do caixa
    // precisa apenas contar quantos itens o cliente está levando e olhar na tabela de preços. Você foi contra-
    // tado para desenvolver o programa que monta esta tabela de preços, que conterá os preços de 1 até 50 produtos,
    // conforme o exemplo abaixo:
    // Lojas Quase Dois - Tabela de preços
    // 1 - R$ 1.99
    // 50 - R$ 99.50

    public static void main(String[] args) {

        final float preco = 1.99f;
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i=1; i<=50; i++){
            float valorFinal = preco * i;
            System.out.println(i + " - R$ " + df.format(valorFinal));
            if (i % 10 == 0){
                System.out.println("\t");
            }
        }
    }
}
