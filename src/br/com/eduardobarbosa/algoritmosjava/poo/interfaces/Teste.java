package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Teste {
    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro(2, 10);
        System.out.println("Cilindro");
        System.out.println("Área da base: " + Utils.maskMedidas.format(cilindro.calcularAreaBase()) + " m²");
        System.out.println("Área lateral: " + Utils.maskMedidas.format(cilindro.calcularAreaLateral()) + " m²");
        System.out.println("Área total: ± " + Utils.maskMedidas.format(cilindro.calcularArea()) + " m²");
        System.out.println("Volume: " + Utils.maskMedidas.format(cilindro.calcularVolume()) + " m³");

        Circulo circulo = new Circulo(15);
        System.out.println("\nCírculo");
        System.out.println("Área do círculo: " + Utils.maskMedidas.format(circulo.calcularArea()) + " cm²");

        Cubo cubo = new Cubo(2);
        System.out.println("\nCubo");
        System.out.println("Área do cubo: " + Utils.maskMedidas.format(cubo.calcularArea()) + " cm²");
        System.out.println("Volume do cubo: " + Utils.maskMedidas.format(cubo.calcularVolume()) + " cm³");

        Quadrado quadrado = new Quadrado(6);
        System.out.println("\nQuadrado");
        System.out.println("Área do quadrado: " + Utils.maskMedidas.format(quadrado.calcularArea()));

        Triangulo triangulo = new Triangulo(6, 10);
        System.out.println("\nTriângulo");
        System.out.println("Área do triângulo: " + Utils.maskMedidas.format(triangulo.calcularArea()));
    }
}
