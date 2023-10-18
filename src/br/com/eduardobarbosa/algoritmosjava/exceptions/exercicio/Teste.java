package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Teste {
    public static void main(String[] args) {

        int entradaUsuario;
        String nome, telefone, nomeAgenda;
        int quantidadeContatos;

        // fazer loop do programa até usuario quiser sair

        System.out.print("Digite um nome para a agenda: ");
        nomeAgenda = Utils.scanner.nextLine();

        System.out.print("Digite a quantidade de contatos que a agenda " + nomeAgenda + " conterá: ");
        quantidadeContatos = Utils.scanner.nextInt();

        Agenda agenda = new Agenda(nomeAgenda, quantidadeContatos);

        System.out.println("\nMenu do usuário - Agenda " + nomeAgenda);
        System.out.println("Digite 1 para Consultar um contato");
        System.out.println("Digite 2 para Adicionar novo contato");
        entradaUsuario = Utils.scanner.nextInt();

        Utils.scanner.nextLine();

        if (entradaUsuario == 1){
            System.out.print("Digite o nome do contato a ser consultado: ");
            nome = Utils.scanner.nextLine();

            try {
                agenda.consultarContato(nome);
            } catch (ContatoNaoExisteException exception){
                System.out.println(exception.getMessage());
            } catch (NullPointerException exceptionNull){
                System.out.println("Lista de contatos está vazia, tente adicionar um novo contato.");
            }

        } else if (entradaUsuario == 2) {
            System.out.print("Digite o nome do novo contato: ");
            nome = Utils.scanner.nextLine();

            System.out.print("Digite o telefone do novo contato: ");
            telefone = Utils.scanner.nextLine();

            Contato contato = new Contato(nome, telefone);

            try{
                agenda.adicionarContato(contato);
            } catch (AgendaCheiaException exception){
                System.out.println(exception.getMessage());
            }

        } else {
            // lançar exception de numero invalido
        }
    }
}
