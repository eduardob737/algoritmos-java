package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

public class Contato {

    private String nome;
    private String telefone;
    private int identificador = 0;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        identificador++;
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
