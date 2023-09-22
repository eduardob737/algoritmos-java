package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.matrizes;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc6 {
    // Faça um programa para jogar o jogo de velha. O programa deve permitir que dois jogadores
    // façam uma partida do jogo de velha, usando o computador para ver o tabuleiro.
    // Cada jogador vai alternadamente informando a posição onde deseja colocar a sua peça ('O' ou 'X').
    // O programa deve impedir jogadas inválidas e determinar automaticamente quando o jogo terminou e quem foi
    // o vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.

    public static void main(String[] args) {

        String[][] tabuleiro = new String[3][3];
        String sinal;
        int linha, coluna;
        boolean jogoFinalizado = false;
        int controlador = 1;
        int jogadorDaVez;

        do {
            if (controlador % 2 != 0) {
                jogadorDaVez = 1;
                sinal = "X";
            } else {
                jogadorDaVez = 2;
                sinal = "O";
            }
            System.out.println("É a vez do jogador " + jogadorDaVez);
            System.out.print("Escolha a linha que deseja jogar (Entre 1 e 3): ");
            linha = Utils.scanner.nextInt();

            System.out.print("Escolha a coluna que deseja jogar (Entre 1 e 3): ");
            coluna = Utils.scanner.nextInt();

            linha--;
            coluna--;

            if (tabuleiro[linha][coluna] != null) {
                System.out.println("Posição já ocupada, tente novamente.");
            } else {
                tabuleiro[linha][coluna] = sinal;
                controlador++;

                String pecaVerificada = null;

                if (controlador > 5) {

                    // Verificação horizontal
                    for (String[] linhas : tabuleiro) {
                        for (int j = 0; j < linhas.length; j++) {
                            if (linhas[j] != null) {
                                if (pecaVerificada == null) {
                                    pecaVerificada = linhas[j];
                                } else {
                                    if (!pecaVerificada.equals(linhas[j])) {
                                        break;
                                    } else {
                                        if (j == linhas.length - 1) {
                                            System.out.println("\nFim de jogo!");
                                            if (pecaVerificada.equalsIgnoreCase("X")) {
                                                System.out.println("Jogador 1 (X) venceu na horizontal");
                                            } else {
                                                System.out.println("Jogador 2 (O) venceu na horizontal");
                                            }
                                            jogoFinalizado = true;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        pecaVerificada = null;
                    }

                    if (!jogoFinalizado) {

                        // Verificação vertical
                        for (int j = 0; j < tabuleiro[0].length; j++) {
                            for (int i = 0; i < tabuleiro.length; i++) {
                                if (tabuleiro[i][j] != null) {
                                    if (pecaVerificada == null) {
                                        pecaVerificada = tabuleiro[i][j];
                                    } else {
                                        if (!pecaVerificada.equals(tabuleiro[i][j])) {
                                            break;
                                        } else {
                                            if (i == tabuleiro[i].length - 1) {
                                                System.out.println("\nFim de jogo!");
                                                if (pecaVerificada.equalsIgnoreCase("X")) {
                                                    System.out.println("Jogador 1 (X) venceu na vertical");
                                                } else {
                                                    System.out.println("Jogador 2 (O) venceu na vertical");
                                                }
                                                jogoFinalizado = true;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                            pecaVerificada = null;
                        }

                        // Verificação diagonal
                        for (int i = 0; i < tabuleiro.length; i++) {
                            if (tabuleiro[i][i] != null) {
                                if (pecaVerificada == null) {
                                    pecaVerificada = tabuleiro[i][i];
                                } else {
                                    if (!pecaVerificada.equals(tabuleiro[i][i])) {
                                        break;
                                    } else {
                                        if (i == tabuleiro[i].length - 1) {
                                            System.out.println("\nFim de jogo!");
                                            if (pecaVerificada.equalsIgnoreCase("X")) {
                                                System.out.println("Jogador 1 (X) venceu na diagonal");
                                            } else {
                                                System.out.println("Jogador 2 (O) venceu na diagonal");
                                            }
                                            jogoFinalizado = true;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }

                        if (controlador == 10){
                            System.out.println("\nFim de jogo. Resultado: Velha");
                            jogoFinalizado = true;

                        }
                    }
                }

                System.out.println();
                for (String[] i : tabuleiro) {
                    for (String j : i) {
                        System.out.print(" | " + j);
                    }
                    System.out.println("\n ---------------");
                }
                System.out.println();
            }

        } while (!jogoFinalizado);

    }
}