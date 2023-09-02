package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Lanchonete {

    // O card�pio de uma lanchonete � o seguinte:
    // Especifica��o    C�digo     Pre�o
    // Cachorro Quente   100      R$ 1,20
    // Bauru Simples     101      R$ 1,30
    // Bauru com ovo     102      R$ 1,50
    // Hamb�rguer        103      R$ 1,20
    // Cheeseburguer     104      R$ 1,30
    // Refrigerante      105      R$ 1,00

    // Fa�a um programa que leia o c�digo dos itens pedidos e as quantidades desejadas.
    // Calcule e mostre o valor a ser pago por item (pre�o * quantidade) e o total geral
    // do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.

    public static void main(String[] args) {

        int codigo, quantidade;
        float preco, subTotal, valorTotal = 0;
        String produto;
        boolean encerrar = false;

        do {
            System.out.print("Digite o c�digo do produto: ");
            codigo = Utils.scanner.nextInt();

            produto = switch (codigo) {
                case 100 -> "Cachorro Quente";
                case 101 -> "Bauru Simples";
                case 102 -> "Bauru com ovo";
                case 103 -> "Hamb�rguer";
                case 104 -> "Cheeseburguer";
                case 105 -> "Refrigerante";
                default -> "Inv�lido";
            };

            preco = switch (codigo) {
                case 100, 103 -> 1.20f;
                case 101, 104 -> 1.30f;
                case 102 -> 1.50f;
                case 105 -> 1.00f;
                default -> 0;
            };

            System.out.print("Digite a quantidade de " + produto + ": ");
            quantidade = Utils.scanner.nextInt();

            subTotal = preco * quantidade;
            valorTotal += subTotal;

            System.out.println("Produto: " + produto + " || Valor unit�rio: R$ " + Utils.mask.format(preco) + " || Quantidade: " + quantidade + " || Subtotal: R$ " + Utils.mask.format(subTotal));

            System.out.print("\nDigite ENTER para NOVO PRODUTO ou S para finalizar o pedido: ");
            Utils.scanner.nextLine();

            if (Utils.scanner.nextLine().equalsIgnoreCase("s")) {
                encerrar = true;

                System.out.println("Valor total do pedido: R$ " + Utils.mask.format(valorTotal));
            }

        } while (!encerrar);
    }
}
