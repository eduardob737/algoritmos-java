package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

import java.util.Scanner;

public class VerificadorSenha {

    // Faca um programa que leia um nome de usuario e a sua senha e nao
    // aceite a senha igual ao nome do usuario, mostrando uma mensagem
    // de erro e voltando a pedir as informacoes.

    public static void main(String[] args) {

        boolean senhaValida = false;
        String nomeUsuario;
        Scanner sc = new Scanner(System.in);

        while (!senhaValida) {

            System.out.print("Digite o nome do usuário: ");
            nomeUsuario = sc.next();

            System.out.print("Digite a senha: ");
            String senha = sc.next();

            if (nomeUsuario.equalsIgnoreCase(senha)) {
                System.out.println("Erro! A senha não pode ser igual ao nome do usuário. Tente novamente");
            } else {
                senhaValida = true;
                System.out.println("Senha válida");
            }
        }

    }
}
