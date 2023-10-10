package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

    private double raioBase;
    private double altura;
    private double areaLateral, areaBase, areaTotal;
    private double volume;

    public Cilindro(double raioBase, double altura) {
        this.raioBase = raioBase;
        this.altura = altura;
    }

    double calcularAreaLateral(){
        areaLateral = 2 * Utils.PI * raioBase * altura;
        return areaLateral;
    }

    double calcularAreaBase(){
        areaBase = Utils.PI * (raioBase * raioBase);
        return areaBase;
    }

    @Override
    public double calcularArea() {
        areaTotal = areaLateral + (2 * areaBase);
        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        return volume = Utils.PI * (raioBase * raioBase) * altura;
    }
}
