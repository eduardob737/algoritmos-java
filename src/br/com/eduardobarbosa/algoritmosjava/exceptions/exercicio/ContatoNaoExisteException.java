package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

public class ContatoNaoExisteException extends Exception{

    private String nome;

    public ContatoNaoExisteException(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "O contato " + nome + " não foi localizado.";
    }
}
