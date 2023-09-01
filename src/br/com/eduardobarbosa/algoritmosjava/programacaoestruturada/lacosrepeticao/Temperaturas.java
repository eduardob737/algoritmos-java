package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperaturas {

    // O Departamento Estadual de meteorologia lhe contratou para desenvolver um programa
    // que leia um conjunto indeterminado de temperaturas e informe ao final a menor e maior
    // temperaturas informadas bem como a média das temperaturas.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temperatura, total = 0, contador = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        float media;
        DecimalFormat df = new DecimalFormat("0.00");
        boolean encerrar = false;

        do {
            System.out.print("Digite a temperatura: ");
            temperatura = sc.nextInt();

            contador++;
            total += temperatura;

            if (temperatura > maior){
                maior = temperatura;
            }

            if (temperatura < menor){
                menor = temperatura;
            }

            System.out.print("Aperte ENTER para NOVA TEMPERATURA ou S para SAIR: ");
            sc.nextLine();

            if (sc.nextLine().equalsIgnoreCase("S")){
                encerrar = true;
            }

            System.out.print("\n");

        } while (!encerrar);

        media = (float) total / contador;

        System.out.println("\nMaior temperatura: " + maior + "°");
        System.out.println("Menor temperatura: " + menor + "°");
        System.out.println("Média das temperaturas: " + df.format(media) + "°");

    }
}
