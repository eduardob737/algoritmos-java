package br.com.eduardobarbosa.algoritmosjava.poo;

public class Exc2 {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numeroConta = 51246;
        conta.saldo = 500f;
        conta.especial = true;
        conta.limite = 5000f;

        conta.consultarSaldo();
        conta.depositarDinheiro(200);
        conta.sacarDinheiro(1000);
        conta.verificarChequeEspecial();

    }
}
