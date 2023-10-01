package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, int diaRendimento) {
        super(nomeCliente, numConta);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    float calcularNovoSaldo(float taxaRendimento){
        float rendimento = super.getSaldo() * (taxaRendimento / 100);
        float novoSaldo = super.getSaldo() + rendimento;
        super.setSaldo(novoSaldo);
        return super.getSaldo();
    }

    @Override
    public String toString() {
        return "Conta Poupança \n" + super.toString() + "\nDia de rendimento: " + diaRendimento;
    }
}
