package br.com.eduardobarbosa.algoritmosjava.poo.interfaces;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

    private double raioBase;
    private double altura;
    private double areaLateral, areaBase, areaTotal;
    private double volume;
    private final double PI = Math.PI;

    double calcularAreaLateral(float raio, float altura){
        this.raioBase = raio;
        this.altura = altura;
        areaLateral = 2 * PI * raio * altura;
        areaLateral = Utils.formatDecimalsNumbers(areaLateral);
        return areaLateral;
    }

    double calcularAreaBase(float raio){
        this.raioBase = raio;
        areaBase = PI * (raio * raio);
        areaBase = Utils.formatDecimalsNumbers(areaBase);
        return areaBase;
    }

    @Override
    public double calcularArea() {
        areaTotal = areaLateral + (2 * areaBase);
        areaTotal = Utils.formatDecimalsNumbers(areaTotal);
        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        return volume = PI * (raioBase * raioBase) * altura;
    }
}
