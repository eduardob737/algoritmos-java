package br.com.eduardobarbosa.algoritmosjava.poo.iniciais;

public class Aluno {
    // Exc3 - Escreva uma class para representar um Aluno. Adicione atributos relacionados às caracteristicas
    // de um aluno, como nome, matrícula, curso que está matrículado, nome de 3 disciplinas que está cursando
    // e as notas delas. Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7)
    // numa determinada disciplina. Escreva um programa para testar essa classe, que pede as informações do aluno
    // ao usuário e ao final informa o nome das disciplinas, mostra as notas e se o aluno foi aprovado ou não.

    String nome;
    int matricula;
    String curso;
    String[] disciplinas;
    float[] notas;
    String[] situacaoDisciplina;

    void verificarSituacaoDisciplina(String disciplina){
        int index = -1;
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i].equalsIgnoreCase(disciplina)){
                index = i;

                System.out.println("Aluno " + situacaoDisciplina[index] + " em " + disciplina + " com nota " + notas[index]);
            }
        }

        if (index == -1)
            System.out.println("Disciplina não encontrada, tente novamente.");

    }

    void exibirDadosAluno(){
        System.out.println("\nDADOS DO ALUNO" +
                "\nNome: " + nome +
                "\nMatrícula: " + matricula +
                "\nCurso: " + curso +
                "\nDisciplinas cursadas: ");

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println(disciplinas[i] + " - Nota: " + notas[i] + " - Situação: " + situacaoDisciplina[i]);
        }
    }
}
