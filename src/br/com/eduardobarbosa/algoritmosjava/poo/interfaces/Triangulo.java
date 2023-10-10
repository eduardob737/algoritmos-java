package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

public class Triangulo extends Figura2D implements DimensaoSuperficial{

    private double base;
    private double altura;
    private double area;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return area = (base * altura) / 2;
    }
}