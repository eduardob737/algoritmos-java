package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Circulo extends Figura2D implements DimensaoSuperficial {

    private double area;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return area = Utils.PI * (raio * raio);
    }
}
