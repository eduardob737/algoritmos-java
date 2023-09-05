package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoEquacao2Grau {

    // Faça um programa que calcule as raízes de uma equação do segundo grau,
    // na forma ax2 + bx + C. O programa deverá pedir os valores de a, b e c
    // e fazer as consistências, informando ao usuário nas seguintes situações:
    //   a. Se o usuário informar o valor de A igual a zero, a equação não é
    //      do segundo grau e o programa não deve fazer pedir os demais
    //      valores, sendo encerrado;
    //   b. Se o delta calculado for negativo, a equação não possui raizes
    //      reais. Informe ao usuário e encerre o programa;
    //   C. Se o delta calculado for igual a zero a equação possui apenas
    //      uma raiz real; informe-a ao usuário;
    //   D. Se o delta for positivo, a equação possui duas raiz reais;
    //      informe-as ao usuário;

    static int delta;

    public static void main(String[] args) {

        int a, b, c;
        double x, x1, x2;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor de a: ");
        a = sc.nextInt();

        if (a != 0) {
            System.out.print("Digite o valor de b: ");
            b = sc.nextInt();

            System.out.print("Digite o valor de c: ");
            c = sc.nextInt();

            delta = (b * b) - 4 * a * c;
            System.out.println("\nDelta = " + delta);

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais");
            } else if (delta == 0) {
                x = b * -1;
                x = x / (2*a);
                System.out.println("A raíz da equação é " + df.format(x));

            } else {
                x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
                x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);

                System.out.println("As raízes da equação são " + df.format(x1) + " e " + df.format(x2));
            }
        } else {
            System.out.println("Essa não é uma equação de 2° grau");
        }
    }

}
