package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

public class Agenda {

    private final Contato[] listaContatos;

    public Agenda() {
        listaContatos = new Contato[5];
    }

    public Contato[] getListaContatos() {
        return listaContatos;
    }

    void adicionarContato(Contato novoContato) throws AgendaCheiaException {
        Contato ultimoContato = getListaContatos()[4];
        if (ultimoContato != null) {
            throw new AgendaCheiaException();
        } else {
            listaContatos[novoContato.getIdentificador() - 1] = novoContato;
            System.out.println("Contato adicionado com sucesso!");
        }
    }

    void consultarContato(String nome) throws ContatoNaoExisteException, ListaContatosVazia {
        boolean contatoLocalizado = false;

        if (listaContatos[0] == null) {
            throw new ListaContatosVazia();
        }

        for (Contato contato : listaContatos) {
            if (contato == null)
                break;
            else {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contatoLocalizado = true;
                    System.out.println("Nome: " + contato.getNome() + " | Telefone: " + contato.getTelefone() + " | Identificador: " + contato.getIdentificador());
                    break;
                }
            }
        }

        if (!contatoLocalizado) {
            throw new ContatoNaoExisteException(nome);
        }
    }

    public void imprimirAgenda() throws ListaContatosVazia {
        if (listaContatos[0] == null) {
            throw new ListaContatosVazia();
        }

        for (Contato contato : listaContatos) {
            if (contato == null)
                break;
            else {
                System.out.println("Identificador: " + contato.getIdentificador() + " | Nome: " + contato.getNome() + " | Telefone: " + contato.getTelefone());
            }
        }
    }
}