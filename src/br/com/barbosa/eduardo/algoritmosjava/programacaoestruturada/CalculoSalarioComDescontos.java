package br.com.barbosa.eduardo.algoritmosjava.programacaoestruturada;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoSalarioComDescontos {

    // Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s.
    // Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para
    // o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
    //   a. sal�rio bruto.
    //   b. quanto pagou ao INSS.
    //   C. quanto pagou ao sindicato.
    //   d. o sal�rio l�quido.
    //   e. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
    //      + Sal�rio Bruto R$ - IR (11%) : R$ - INSS (8%) : R$ - S Sindicato ( 5%) : R$ = Sal�rio Liquido : R$

    public static void main(String[] args) {

        float salarioHora, horasTrabalhadas, salarioBruto, salarioLiquido, descontoIR, descontoINSS, descontoSindicato, totalDescontos;

        final float percentualIR = 0.11f;
        final float percentualINSS = 0.08f;
        final float percentualSindicato = 0.05f;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor do sal�rio por hora: ");
        salarioHora = sc.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas no m�s: ");
        horasTrabalhadas = sc.nextFloat();

        salarioBruto = salarioHora * horasTrabalhadas;
        descontoIR = salarioBruto * percentualIR;
        descontoINSS = salarioBruto * percentualINSS;
        descontoSindicato = salarioBruto * percentualSindicato;
        totalDescontos = descontoIR + descontoINSS + descontoSindicato;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("\nSal�rio bruto: R$ " + df.format(salarioBruto) +
                            "\nValor pago ao IR: R$ " + df.format(descontoIR) +
                            "\nValor pago ao INSS: R$ " + df.format(descontoINSS) +
                            "\nValor pago ao sindicato: R$ " + df.format(descontoSindicato) +
                            "\nValor total descontado: R$ " + df.format(totalDescontos) +
                            "\nSal�rio l�quido: R$ " + df.format(salarioLiquido)
        );
    }
}
