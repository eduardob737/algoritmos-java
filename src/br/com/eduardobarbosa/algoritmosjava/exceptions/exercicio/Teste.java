package br.com.eduardobarbosa.algoritmosjava.exceptions.exercicio;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

import java.util.InputMismatchException;

public class Teste {
    public static void main(String[] args) {

        int entradaUsuario, contador = 0;
        String nome, telefone;
        String opcaoSaida;
        boolean entradaValida, sair;
        Agenda agenda = new Agenda();
        Contato contato;

        do {
            do {
                System.out.println("\nMenu do usuário - Agenda");
                System.out.println("1 para Consultar um contato || 2 para Adicionar novo contato");
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
                            System.out.println(exception);
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
                            System.out.println(exception);
                        }

                    } else {
                        System.out.println("Número inválido, tente novamente.");
                        entradaValida = false;
                    }

                } catch (InputMismatchException inputMismatchException){
                    System.out.println("Entrada inválida, tente novamente inserindo um número");
                    entradaValida = false;
                    Utils.scanner.nextLine();
                }
            } while (!entradaValida);

                System.out.println("\nDigite S para SAIR ou qualquer tecla para repetir o programa: ");
                opcaoSaida = Utils.scanner.nextLine();

                sair = opcaoSaida.equalsIgnoreCase("S");

            } while (!sair);
        }
    }