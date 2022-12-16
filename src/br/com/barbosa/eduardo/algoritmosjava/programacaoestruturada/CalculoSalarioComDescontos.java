package br.com.barbosa.eduardo.algoritmosjava.programacaoestruturada;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSalarioComDescontos {

    // Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para
    // o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    //   a. salário bruto.
    //   b. quanto pagou ao INSS.
    //   C. quanto pagou ao sindicato.
    //   d. o salário líquido.
    //   e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
    //      + Salário Bruto R$ - IR (11%) : R$ - INSS (8%) : R$ - S Sindicato ( 5%) : R$ = Salário Liquido : R$

    public static void main(String[] args) {

        float salarioHora, horasTrabalhadas, salarioBruto, salarioLiquido, descontoIR, descontoINSS, descontoSindicato, totalDescontos;

        final float percentualIR = 0.11f;
        final float percentualINSS = 0.08f;
        final float percentualSindicato = 0.05f;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor do salário por hora: ");
        salarioHora = sc.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextFloat();

        salarioBruto = salarioHora * horasTrabalhadas;
        descontoIR = salarioBruto * percentualIR;
        descontoINSS = salarioBruto * percentualINSS;
        descontoSindicato = salarioBruto * percentualSindicato;
        totalDescontos = descontoIR + descontoINSS + descontoSindicato;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("\nSalário bruto: R$ " + df.format(salarioBruto) +
                            "\nValor pago ao IR: R$ " + df.format(descontoIR) +
                            "\nValor pago ao INSS: R$ " + df.format(descontoINSS) +
                            "\nValor pago ao sindicato: R$ " + df.format(descontoSindicato) +
                            "\nValor total descontado: R$ " + df.format(totalDescontos) +
                            "\nSalário líquido: R$ " + df.format(salarioLiquido)
        );
    }
}
