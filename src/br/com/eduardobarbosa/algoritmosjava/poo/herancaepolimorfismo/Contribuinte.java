package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public abstract class Contribuinte {

    private String nome;
    private float aliquota;
    private float rendaBruta;

    public Contribuinte(String nome, float rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAliquota() {
        return aliquota;
    }

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(float rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract float calculoImposto();

    @Override
    public String toString() {
        return "\nContribuinte " + nome +
                "\nRenda bruta: R$ " + Utils.mask.format(rendaBruta);
    }
}
