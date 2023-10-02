package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class PessoaFisica extends Contribuinte {

    private float valorDeduzido;

    public PessoaFisica(String nome, float rendaBruta) {
        super(nome, rendaBruta);
    }

    public float getValorDeduzido() {
        return valorDeduzido;
    }

    public void setValorDeduzido(float valorDeduzido) {
        this.valorDeduzido = valorDeduzido;
    }

    @Override
    public float calculoImposto() {
        if (getRendaBruta() > 0 && getRendaBruta() <= 1400) {
            setAliquota(0f);
            setValorDeduzido(0);
        } else if (getRendaBruta() >= 1400.01 && getRendaBruta() <= 2100){
            setAliquota(10f);
            setValorDeduzido(100);
        } else if (getRendaBruta() >= 2100.01 && getRendaBruta() <= 2800){
            setAliquota(15f);
            setValorDeduzido(270);
        } else if (getRendaBruta() >= 2800.01 && getRendaBruta() <= 3600){
            setAliquota(25f);
            setValorDeduzido(500);
        } else if (getRendaBruta() >= 3600.01) {
            setAliquota(30f);
            setValorDeduzido(700);
        }

        return super.getRendaBruta() * (getAliquota() / 100) - getValorDeduzido();
    }

    @Override
    public String toString() {
        return "\nPessoa Física" + super.toString() + "\nAlíquota: " + getAliquota() + "%" +
                "\nParcela a deduzir: R$ " + Utils.mask.format(getValorDeduzido()) +
                "\nImposto: R$ " + Utils.mask.format(calculoImposto());
    }
}
