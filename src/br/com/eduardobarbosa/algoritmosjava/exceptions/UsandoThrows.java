package br.com.eduardobarbosa.algoritmosjava.exceptions;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        System.out.println("Entre com um n�mero decimal: ");
        try {
            double num = leNumero();
        } catch (Exception e) {
            System.out.println("Entrada inv�lida");
            e.printStackTrace();
        }
    }

    public static double leNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }
}