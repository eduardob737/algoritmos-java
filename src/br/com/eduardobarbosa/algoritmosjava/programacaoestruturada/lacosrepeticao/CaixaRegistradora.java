package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CaixaRegistradora {
    // Faça um programa que implemente uma caixa registradora rudimentar. O programa deverá receber um número
    // desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo
    // operador para indicar o final da compra. O programa deve então mostrar o total da compra e perguntar
    // o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
    // Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída
    // deve ser conforme o exemplo abaixo:
    // Lojas Tabajara
    //
    // Produto 1: R$ 2.20
    // Produto 2: R$ 5.80
    // Produto 3: R$ O
    // Total: R$ 8.00
    // Dinheiro: R$ 20.00
    // Troco: R$ 12.00

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.00");
            float valor, valorTotal = 0, dinheiro, troco;
            int i = 1;

            System.out.println("Lojas Tabajara");

            do {
                System.out.print("Produto " + i + ": R$ ");
                valor = sc.nextFloat();
                i++;
                valorTotal += valor;

            } while (valor != 0);

            System.out.println("Valor total: R$ " + df.format(valorTotal));

            System.out.print("Dinheiro: R$ ");
            dinheiro = sc.nextFloat();

            troco = dinheiro - valorTotal;

            System.out.println("Troco: R$ " + df.format(troco));
            System.out.println("-------------------");
        }
    }
}
