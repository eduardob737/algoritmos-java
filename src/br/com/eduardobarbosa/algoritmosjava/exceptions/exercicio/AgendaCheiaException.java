package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

public class AgendaCheiaException extends Exception {

    private String nomeAgenda;
    private int quantidadeContatos;

    public AgendaCheiaException(Agenda agenda) {
        nomeAgenda = agenda.getNome();
        quantidadeContatos = agenda.getQuantidadeContatos();
    }

    @Override
    public String toString() {
        return "Agenda " + nomeAgenda + "excedeu o limite de " + quantidadeContatos + " contatos.";
    }
}
