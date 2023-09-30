package br.com.eduardobarbosa.algoritmosjava.poo.relacionamentoentreclasses;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc1 {
    // Escreva uma classe Agenda, que contém vários contatos do tipo Contato.
    // Cada contato possui nome, telefone e email. A agenda também possui um nome.
    // Crie um programa teste que peça para o usuário entrar com o nome da Agenda e em
    // seguida 3 contatos. Crie métodos que retornem uma “String” com a informação de cada
    // contato da agenda.

    public static void main(String[] args) {

        Agenda agenda;
        Contato[] contatos = new Contato[3];

        System.out.print("Digite um nome para a agenda: ");
        agenda = new Agenda(Utils.scanner.nextLine());

        for (int i = 0; i < 3; i++) {
            Contato contato = new Contato();

            System.out.println();

            System.out.print("Digite o nome do contato " + (i+1) + ": ");
            contato.setNome(Utils.scanner.nextLine());

            System.out.print("Digite o telefone do contato " + contato.getNome() + ": ");
            contato.setTelefone(Utils.scanner.nextLine());

            System.out.print("Digite o email do contato " + contato.getNome() + ": ");
            contato.setEmail(Utils.scanner.nextLine());

            contatos[i] = contato;
        }

        agenda.setContatos(contatos);
        agenda.exibirAgenda();

    }
}
