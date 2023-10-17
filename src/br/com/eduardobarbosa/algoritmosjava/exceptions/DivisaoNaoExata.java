package br.com.eduardobarbosa.algoritmosjava.exceptions;

public class DivisaoNaoExata extends Exception {

    private int num;
    private int den;

    public DivisaoNaoExata(int num, int den) {
        this.num = num;
        this.den = den;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + den + " não é um inteiro";
    }
}
