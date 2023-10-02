package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class PessoaJuridica extends Contribuinte {

    public PessoaJuridica(String nome, float rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public float calculoImposto(){
        setAliquota(10f);
        return super.getRendaBruta() * (getAliquota() / 100);
    }

    @Override
    public String toString() {
        return "\nPessoa Jurídica" + super.toString() + "\nAlíquota: " + getAliquota() + "%" +
                "\nImposto: R$ " + Utils.mask.format(calculoImposto());
    }
}
