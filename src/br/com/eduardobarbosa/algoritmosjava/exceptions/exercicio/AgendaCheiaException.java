package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

public class AgendaCheiaException extends Exception {

    public AgendaCheiaException() {
    }

    @Override
    public String toString() {
        return "Agenda excedeu o limite de 5 contatos";
    }
}
