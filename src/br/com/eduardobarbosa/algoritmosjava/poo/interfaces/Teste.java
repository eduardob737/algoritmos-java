package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Teste {
    public static void main(String[] args) {

        Cilindro cil = new Cilindro();
        System.out.println("Área da base: " + Utils.maskMedidas.format(cil.calcularAreaBase(3)) + " m²");
        System.out.println("Área lateral: " + Utils.maskMedidas.format(cil.calcularAreaLateral(3, 5)) + " m²");
        System.out.println("Área total: ±" + Utils.maskMedidas.format(cil.calcularArea()) + " m²");
        System.out.println("Volume: " + Utils.maskMedidas.format(cil.calcularVolume()) + " m³");

    }
}
