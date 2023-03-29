package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class ValidacaoDados {
    // Faca um programa que leia e valide as seguintes informacoes:
    // Nome: maior que 3 caracteres;
    // Idade: entre 0 e 150;
    // Salario: maior que zero;
    // Sexo: 'f' ou 'm';
    // Estado Civil: 's', 'c', 'v', 'd';

    public static void main(String[] args) {

        String nome, sexo;
        int idade;
        float salario;
        String estadoCivil;
        boolean dadosValidos;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Digite o nome: ");
            nome = sc.next();

            System.out.print("Digite a idade: ");
            idade = sc.nextInt();

            System.out.print("Digite o salário: ");
            salario = sc.nextFloat();

            System.out.print("Digite o sexo (F ou M): ");
            sexo = sc.next(); 

            System.out.print("Digite o estado civil (S, C, V, D): ");
            estadoCivil = sc.next();

            dadosValidos = ((nome.length() > 3) && (idade >= 0 && idade <= 150) && (salario > 0.0f) &&
                    (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) &&
                    (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
                            estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")));

            if (dadosValidos){
                System.out.println("Dados válidos");
            } else {
                System.out.println("Dados inválidos");
            }

        } while (!dadosValidos);
    }
}
