package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

public class Contato {

    private String nome;
    private String telefone;
    private int identificador;

    public Contato(String nome, String telefone, int identificador) {
        this.nome = nome;
        this.telefone = telefone;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdentificador() {
        return identificador;
    }
}
