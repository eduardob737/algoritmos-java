package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoPromocaoCarnes {

    // O Hipermercado Tabajara esta com uma promogao de carnes que é imperdivel. Confira:
    //                    Até 5 Kg                  Acima de 5 Kg
    //  File Duplo     R$ 4,90 por Kg               R$ 5,80 por Kg
    //  Alcatra        R$ 5,90 por Kg               R$ 6,80 por Kg
    //  Picanha        R$ 6,90 por Kg               R$ 7,80 por Kg
    //
    // Para atender a todos os clientes, cada cliente podera levar apenas um dos tipos de
    // carne da promocao, porém nao ha limites para a quantidade de carne por cliente.
    // Se compra for feita no cartao Tabajara o cliente recebera ainda um desconto
    // de 5% sobre o total a compra. Escreva um programa que peca o tipo e a quantidade
    // de carne comprada pelo usuario e gere um cupom fiscal, contendo as informagdes da
    // compra: tipo e quantidade de carne, preco total, tipo de pagamento, valor do desconto
    // e valor a pagar.

    public static void main(String[] args) {

        String tipoCarne, tipoPagamento;
        float qtdCarne, precoKg = 0, subTotal, valorDesconto = 0, valorAPagar;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite o tipo de carne comprada");
        System.out.print("(F para File duplo, A para Alcatra ou P para Picanha): ");
        tipoCarne = sc.next();

        System.out.print("Digite a quantidade de carne comprada (em Kg): ");
        qtdCarne = sc.nextFloat();

        System.out.println("Digite o tipo de pagamento");
        System.out.print("(C para cartão comum, D para dinheiro ou T para Cartão Tabajara): ");
        tipoPagamento = sc.next();

        switch (tipoCarne) {
            case "F", "f" -> {
                if (qtdCarne <= 5.0f) {
                    precoKg = 4.90f;
                } else {
                    precoKg = 5.80f;
                }
                tipoCarne = "Filé duplo";
            }
            case "A", "a" -> {
                if (qtdCarne <= 5.0f) {
                    precoKg = 5.90f;
                } else {
                    precoKg = 6.80f;
                }
                tipoCarne = "Alcatra";
            }
            case "P", "p" -> {
                if (qtdCarne <= 5.0f) {
                    precoKg = 6.90f;
                } else {
                    precoKg = 7.80f;
                }
                tipoCarne = "Picanha";
            }
        }

        subTotal = qtdCarne * precoKg;

        switch (tipoPagamento){
            case "C", "c" ->
                tipoPagamento = "Cartão Comum";
            case "D", "d" ->
                tipoPagamento = "Dinheiro";
            case "T", "t" -> {
                tipoPagamento = "Cartão Tabajara";
                valorDesconto = subTotal * 0.05f;
            }
        }

        valorAPagar = subTotal - valorDesconto;

        System.out.println("\n------CUPOM FISCAL------");
        System.out.println("\nTipo de carne: " + tipoCarne);
        System.out.println("Quantidade de carne: " + df.format(qtdCarne) + "kg");
        System.out.println("Sub-total: R$ " + df.format(subTotal));
        System.out.println("Tipo de pagamento: " + tipoPagamento);
        System.out.println("Valor de desconto: R$ " + df.format(valorDesconto));
        System.out.println("Total a pagar: R$ " + df.format(valorAPagar));

    }
}
