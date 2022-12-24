package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.util.Scanner;

public class CalculoSalario {

    // Desafio: Fazer um programa que pergunte quanto você ganha por hora e o número de horas
    // trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

    public static void main(String[] args) {

        float salarioHora, horasTrabalhadas, salarioTotal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salário por hora: ");
        salarioHora = sc.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextFloat();

        salarioTotal = salarioHora * horasTrabalhadas;

        System.out.println("O salário total é de: R$" + salarioTotal);
    }
}
