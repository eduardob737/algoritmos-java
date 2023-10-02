package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero(String nome, int comprimento, String cor, float velocidade) {
        super(nome, comprimento, cor, "terra", velocidade);
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {

        return "\nNome: " + getNome() +
                "\nEspécie: Mamífero" +
                super.toString() +
                "\nAlimento: " + alimento;
    }
}
