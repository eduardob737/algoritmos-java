package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

public class ListaContatosVazia extends Exception{

    @Override
    public String toString() {
        return "A lista de contatos está vazia, tente adicionar um novo contato.";
    }
}
