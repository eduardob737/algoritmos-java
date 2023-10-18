package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

public class Agenda {

    private String nome;
    private Contato[] listaContatos;
    private int quantidadeContatos;

    public Agenda(String nome, int quantidadeContatos) {
        this.nome = nome;
        this.quantidadeContatos = quantidadeContatos;
        listaContatos = new Contato[quantidadeContatos];
    }

    public String getNome() {
        return nome;
    }

    public Contato[] getListaContatos() {
        return listaContatos;
    }

    public int getQuantidadeContatos() {
        return quantidadeContatos;
    }

    void adicionarContato(Contato novoContato) throws AgendaCheiaException {
        int ultimaPosicao = listaContatos.length - 1;
        if (listaContatos[ultimaPosicao] != null){
            throw new AgendaCheiaException(this);
        } else {
            listaContatos[novoContato.getIdentificador()] = novoContato;
            System.out.println("Contato adicionado com sucesso!");
        }
    }

    void consultarContato(String nome) throws ContatoNaoExisteException {
        for (Contato contato : listaContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + contato.getNome() + " Telefone: " + contato.getTelefone());
            } else {
                throw new ContatoNaoExisteException(nome);
            }
        }
    }
}