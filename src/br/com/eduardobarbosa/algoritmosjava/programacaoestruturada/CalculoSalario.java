package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class CalculoSalario {

    // Desafio: Fazer um programa que pergunte quanto voc� ganha por hora e o n�mero de horas
    // trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.

    public static void main(String[] args) {

        float salarioHora, horasTrabalhadas, salarioTotal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do sal�rio por hora: ");
        salarioHora = sc.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas no m�s: ");
        horasTrabalhadas = sc.nextFloat();

        salarioTotal = salarioHora * horasTrabalhadas;

        System.out.println("O sal�rio total � de: R$" + salarioTotal);
    }
}
