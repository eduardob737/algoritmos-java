package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.exerciciossimples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoEquacao2Grau {

    // Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau,
    // na forma ax2 + bx + C. O programa dever� pedir os valores de a, b e c
    // e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:
    //   a. Se o usu�rio informar o valor de A igual a zero, a equa��o n�o �
    //      do segundo grau e o programa n�o deve fazer pedir os demais
    //      valores, sendo encerrado;
    //   b. Se o delta calculado for negativo, a equa��o n�o possui raizes
    //      reais. Informe ao usu�rio e encerre o programa;
    //   C. Se o delta calculado for igual a zero a equa��o possui apenas
    //      uma raiz real; informe-a ao usu�rio;
    //   D. Se o delta for positivo, a equa��o possui duas raiz reais;
    //      informe-as ao usu�rio;

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
                System.out.println("A equa��o n�o possui ra�zes reais");
            } else if (delta == 0) {
                x = b * -1;
                x = x / (2*a);
                System.out.println("A ra�z da equa��o � " + df.format(x));

            } else {
                x1 = ((b * -1) + Math.sqrt(delta)) / (2 * a);
                x2 = ((b * -1) - Math.sqrt(delta)) / (2 * a);

                System.out.println("As ra�zes da equa��o s�o " + df.format(x1) + " e " + df.format(x2));
            }
        } else {
            System.out.println("Essa n�o � uma equa��o de 2� grau");
        }
    }

}
