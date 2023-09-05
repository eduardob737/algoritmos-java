package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoCombustivel {

    // Um posto está vendendo combustiveis com a seguinte tabela de descontos:
    // Alcool:  Até 20 litros, desconto de 3% por litro. Acima de 20 litros, desconto de 5% por litro.
    // Gasolina: Até 20 litros, desconto de 4% por litro. Acima de 20 litros, desconto de 6% por litro.
    //
    // Escreva um algoritmo que leia o numero de litros vendidos, o tipo de
    // combustivel (codificado da seguinte forma: A-alcool, G- gasolina), calcule
    // e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
    // gasolina é R$ 2,50 0 preço do litro do alcool é R$ 1,90.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        float litros, percDesc, desconto, valorBruto, valorComDesconto;
        final float precoAlcool = 1.90f;
        final float precoGasolina = 2.50f;
        String tipoCombustivel;

        System.out.print("Digite a quantidade de litros vendidos: ");
        litros = sc.nextFloat();

        System.out.print("Digite o tipo de combustível (A- Álcool ou G- Gasolina):  ");
        tipoCombustivel = sc.next();

        switch (tipoCombustivel){
            case "A", "a" -> {
                percDesc = litros <= 20.0f ? 3 : 5;
                desconto = litros * percDesc / 100;
                valorBruto = litros * precoAlcool;
                valorComDesconto = valorBruto - desconto;

                System.out.println("\nPreço por litro: R$ " + df.format(precoAlcool) +
                                    "\nValor sem desconto: R$ " + df.format(valorBruto) +
                                    "\nDesconto (" + percDesc + "% p/ litro): R$ " + df.format(desconto) +
                                    "\nValor a pagar: R$ " + df.format(valorComDesconto));
            }

            case "G", "g" -> {
                percDesc = litros <= 20.0f ? 4 : 6;
                desconto = litros * percDesc / 100;
                valorBruto = litros * precoGasolina;
                valorComDesconto = valorBruto - desconto;

                System.out.println("\nPreço por litro: R$ " + df.format(precoGasolina) +
                                    "\nValor sem desconto: R$ " + df.format(valorBruto) +
                                    "\nDesconto (" + percDesc + "% p/ litro): R$ " + df.format(desconto) +
                                    "\nValor a pagar: R$ " + df.format(valorComDesconto));
            }
            default -> System.out.println("Tipo inválido");
        }
    }
}
