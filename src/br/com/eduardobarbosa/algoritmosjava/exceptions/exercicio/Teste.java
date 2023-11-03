package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

import java.util.InputMismatchException;

public class Teste {
    public static void main(String[] args) {

        int entradaUsuario, contador = 0;
        String nome, telefone;
        boolean entradaValida, sair = false;
        Agenda agenda = new Agenda();
        Contato contato;

        do {
            System.out.println("\nMenu do usuário - Agenda");
            System.out.println("1 para Consultar um contato || 2 para Adicionar novo contato || 3 - Imprimir agenda || 4 para sair");
            System.out.print("Digite a opção escolhida: ");

            try {
                entradaValida = true;

                entradaUsuario = Utils.scanner.nextInt();
                Utils.scanner.nextLine();

                if (entradaUsuario == 1) {
                    System.out.print("Digite o nome do contato a ser consultado: ");
                    nome = Utils.scanner.nextLine();

                    try {
                        agenda.consultarContato(nome);
                    } catch (ContatoNaoExisteException | ListaContatosVazia exception) {
                        System.out.println(exception.getMessage());
                    }

                } else if (entradaUsuario == 2) {
                    System.out.print("Digite o nome do novo contato: ");
                    nome = Utils.scanner.nextLine();

                    System.out.print("Digite o telefone do novo contato: ");
                    telefone = Utils.scanner.nextLine();

                    contador++;
                    contato = new Contato(nome, telefone, contador);

                    try {
                        agenda.adicionarContato(contato);
                    } catch (AgendaCheiaException exception) {
                        System.out.println(exception.getMessage());
                    }
                } else if (entradaUsuario == 3) {
                    try {
                        agenda.imprimirAgenda();
                    } catch (ListaContatosVazia exception) {
                        System.out.println(exception.getMessage());
                    }

                } else if (entradaUsuario == 4) {
                    sair = true;
                } else {
                    System.out.println("Número inválido, tente novamente.");
                    entradaValida = false;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Entrada inválida, tente novamente inserindo um número");
                entradaValida = false;
                Utils.scanner.nextLine();
            }
        } while (!entradaValida || !sair);
    }
}