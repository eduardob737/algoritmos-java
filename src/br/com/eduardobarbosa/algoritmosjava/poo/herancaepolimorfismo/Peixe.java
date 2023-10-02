package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

import java.util.Arrays;

public class Peixe extends Animal {

    private String[] caracteristicas;

    public Peixe(String nome, int comprimento, float velocidade) {
        super(nome, comprimento, "Cinzenta", "Mar", velocidade);
        setNumPatas(0);
        caracteristicas = new String[]{"Barbatanas", "Cauda"};
    }

    public String[] getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String[] caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
                "\nEspécie: Peixe" +
                super.toString() +
                "\nCaracterística(s): " + Arrays.toString(caracteristicas);
    }
}