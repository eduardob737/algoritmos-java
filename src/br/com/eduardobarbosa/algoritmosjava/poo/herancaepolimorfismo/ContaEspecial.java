package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class ContaEspecial extends ContaBancaria {

    private float limite;

    public ContaEspecial(String nomeCliente, int numConta, float limite) {
        super(nomeCliente, numConta);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    void sacar(float valor) {
        super.sacar(valor);
        if (getSaldo() >= valor) {
            System.out.println("Saque de R$ " + Utils.mask.format(valor) + " realizado com sucessso.");
            setSaldo(getSaldo() - valor);
            System.out.println("Saldo atualizado: R$ " + Utils.mask.format(getSaldo()));
        } else {
            float valorFaltante = valor - getSaldo();
            if (limite >= valorFaltante) {
                setSaldo(0);
                limite -= valorFaltante;
                System.out.println("Saque de R$ " + Utils.mask.format(valor) + " realizado com sucessso utilizando cheque especial.");
                System.out.println("Saldo atualizado: R$ " + Utils.mask.format(getSaldo()));
                System.out.println("Limite atualizado: R$ " + Utils.mask.format(limite));
            } else {
                System.out.println("Saldo insuficiente, tente novamente.");
            }
        }
    }

    @Override
    public String toString() {
        return "Conta Especial \n" + super.toString() + "\nLimite: R$ " + Utils.mask.format(getLimite());
    }
}