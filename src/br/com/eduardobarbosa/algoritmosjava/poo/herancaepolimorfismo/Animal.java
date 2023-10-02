package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

public class Animal {

    private String nome;
    private int comprimento;
    private int numPatas = 4;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal(String nome, int comprimento, String cor, String ambiente, float velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "\nComprimento: " + comprimento + " cm" +
                "\nPatas: " + numPatas +
                "\nCor: " + cor +
                "\nAmbiente: " + ambiente +
                "\nVelocidade: " + velocidade + " m/s";
    }
}
