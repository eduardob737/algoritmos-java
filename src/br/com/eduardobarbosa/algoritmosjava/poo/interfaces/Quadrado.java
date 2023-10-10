package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

public class Quadrado extends Figura2D implements DimensaoSuperficial{

    private double lado;
    private double area;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return area = lado * lado;
    }
}
