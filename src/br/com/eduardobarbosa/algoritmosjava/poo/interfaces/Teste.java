package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Teste {
    public static void main(String[] args) {

        Cilindro cil = new Cilindro();
        System.out.println("�rea da base: " + Utils.maskMedidas.format(cil.calcularAreaBase(3)) + " m�");
        System.out.println("�rea lateral: " + Utils.maskMedidas.format(cil.calcularAreaLateral(3, 5)) + " m�");
        System.out.println("�rea total: �" + Utils.maskMedidas.format(cil.calcularArea()) + " m�");
        System.out.println("Volume: " + Utils.maskMedidas.format(cil.calcularVolume()) + " m�");

    }
}
