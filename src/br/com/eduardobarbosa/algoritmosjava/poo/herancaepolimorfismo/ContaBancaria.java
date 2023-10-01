package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private float saldo = 0;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, int numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    void sacar(float valor){
        if (valor < saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + Utils.mask.format(valor) + " realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente, tente novamente.");
        }
    }

    void depositar(float valor){
        saldo += valor;
        System.out.println("Depósito de R$ " + Utils.mask.format(valor) + " realizado com sucesso");
    }

    float consultarSaldo(){
        return getSaldo();
    }

    @Override
    public String toString() {
        return  "Nome do cliente: " + getNomeCliente() + "\n" +
                "Número da conta: " + getNumConta() + "\n" +
                "Saldo: R$ " + Utils.mask.format(getSaldo());
    }
}
