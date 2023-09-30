package br.com.eduardobarbosa.algoritmosjava.poo.relacionamentoentreclasses;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public Agenda(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    void exibirAgenda(){
        System.out.println("\nNome da agenda: " + getNome() + "\nContatos: ");

        for (Contato contato : contatos) {
            System.out.println(
                    "\nNome: " + contato.getNome() +
                    "\nTelefone: " + contato.getTelefone() +
                    "\nEmail: " + contato.getEmail());
        }
    }
}
