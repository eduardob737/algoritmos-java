package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    private double aresta;
    private double areaTotal;
    private double volume;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return areaTotal = 6 * (aresta * aresta);
    }

    @Override
    public double calcularVolume() {
        return volume = aresta * aresta * aresta;
    }
}
