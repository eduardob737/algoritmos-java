package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Teste {
    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro(2, 10);
        System.out.println("Cilindro");
        System.out.println("�rea da base: " + Utils.maskMedidas.format(cilindro.calcularAreaBase()) + " m�");
        System.out.println("�rea lateral: " + Utils.maskMedidas.format(cilindro.calcularAreaLateral()) + " m�");
        System.out.println("�rea total: � " + Utils.maskMedidas.format(cilindro.calcularArea()) + " m�");
        System.out.println("Volume: " + Utils.maskMedidas.format(cilindro.calcularVolume()) + " m�");

        Circulo circulo = new Circulo(15);
        System.out.println("\nC�rculo");
        System.out.println("�rea do c�rculo: " + Utils.maskMedidas.format(circulo.calcularArea()) + " cm�");

        Cubo cubo = new Cubo(2);
        System.out.println("\nCubo");
        System.out.println("�rea do cubo: " + Utils.maskMedidas.format(cubo.calcularArea()) + " cm�");
        System.out.println("Volume do cubo: " + Utils.maskMedidas.format(cubo.calcularVolume()) + " cm�");

        Quadrado quadrado = new Quadrado(6);
        System.out.println("\nQuadrado");
        System.out.println("�rea do quadrado: " + Utils.maskMedidas.format(quadrado.calcularArea()));

        Triangulo triangulo = new Triangulo(6, 10);
        System.out.println("\nTri�ngulo");
        System.out.println("�rea do tri�ngulo: " + Utils.maskMedidas.format(triangulo.calcularArea()));
    }
}
