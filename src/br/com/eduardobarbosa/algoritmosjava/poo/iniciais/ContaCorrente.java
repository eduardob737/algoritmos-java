package br.com.eduardobarbosa.algoritmosjava.poo.iniciais;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class ContaCorrente {
    // Exc2 - Crie uma classe para representar uma conta corrente que possui um n�mero, um saldo,
    // um status que informa se ela � especial ou n�o, um limite. Desenvolva m�todos para realizar
    // saque (verificando se o cliente pode realizar saques), depositar dinheiro, consulta saldo e
    // verificar se o cliente est� usando cheque especial ou n�o. Desenvolva um programa para testar
    // essa classe.

    int numeroConta;
    float saldo;
    boolean especial;
    float limite;

    void sacarDinheiro(float valor){
        if (saldo >= valor){
            System.out.println("Saque de R$ " + Utils.mask.format(valor) + " realizado com sucessso.");
            saldo -= valor;
            System.out.println("Saldo atualizado: R$ " + Utils.mask.format(saldo));
        } else {
            float valorFaltante = valor - saldo;
            if (especial && limite >= valorFaltante){
                saldo = 0;
                limite-= valorFaltante;
                System.out.println("Saque de R$ " + Utils.mask.format(valor) + " realizado com sucessso utilizando cheque especial.");
                System.out.println("Saldo atualizado: R$ " + Utils.mask.format(saldo));
                System.out.println("Limite atualizado: R$ " + Utils.mask.format(limite));
            } else {
                System.out.println("Saldo insuficiente, tente novamente.");
            }
        }
    }

    void depositarDinheiro(float valor){
        System.out.println("Dep�sito de R$ " + Utils.mask.format(valor) + " realizado com sucesso");
        saldo += valor;
        System.out.println("Saldo atualizado: R$ " + Utils.mask.format(saldo));
    }

    void consultarSaldo(){
        System.out.println("Saldo da conta: R$ " + Utils.mask.format(saldo));
    }

    void verificarChequeEspecial(){
        if (especial){
            System.out.println("Cheque especial est� sendo utilizado.");
        } else {
            System.out.println("Cheque especial n�o est� sendo utilizado.");
        }
    }
}
