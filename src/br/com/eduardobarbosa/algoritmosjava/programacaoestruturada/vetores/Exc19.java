package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.vetores;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc19 {
    // Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois
    // vetores "Nota1" e "Nota2" do tipo real. Escreva um programa que calcule a média aritmética simples
    // das notas informadas armazenando o resultado em um vetor "Result" de mesmo tipo e tamanho.
    // Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior ou igual
    // a 7 o aluno estará "aprovado", caso contrário, a situação do aluno será "reprovado".

    public static void main(String[] args) {

        float[] notas1 = new float[10];
        float[] notas2 = new float[10];
        float[] result = new float[10];
        String situacao;

        System.out.print("Notas 1: ");

        for (int i = 0; i < notas1.length; i++) {
            notas1[i] = Utils.random.nextFloat(10.1f);

            if (i == 0) {
                System.out.print(Utils.mask.format(notas1[i]));
            } else {
                System.out.print(" | " + Utils.mask.format(notas1[i]));
            }
        }

        System.out.print("\nNotas 2: ");

        for (int i = 0; i < notas2.length; i++) {
            notas2[i] = Utils.random.nextFloat(10.1f);

            if (i == 0) {
                System.out.print(Utils.mask.format(notas2[i]));
            } else {
                System.out.print(" | " + Utils.mask.format(notas2[i]));
            }
        }

        System.out.println("\n");

        for (int i = 0; i < result.length; i++){
            result[i] = (notas1[i] + notas2[i]) / 2;

            if (result[i] >= 7){
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }

            System.out.println("Média " + i + ": " + Utils.mask.format(result[i]) + " | Situação: " + situacao);

        }
    }
}