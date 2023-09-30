package br.com.eduardobarbosa.algoritmosjava.poo.relacionamentoentreclasses;

public class Aluno {

    private String nome;
    private int matricula;
    private float[] notas = new float[4];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    float getMediaAluno(){
        float somaNotas = 0;
        float media;

        for (float nota : notas){
            somaNotas += nota;
        }

        media = somaNotas / notas.length;

        return media;
    }

    String getSituacaoAluno(){
        if (getMediaAluno() >= 7){
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }
}
