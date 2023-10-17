package br.com.eduardobarbosa.algoritmosjava.poo.iniciais;

public class Aluno {
    // Exc3 - Escreva uma class para representar um Aluno. Adicione atributos relacionados �s caracteristicas
    // de um aluno, como nome, matr�cula, curso que est� matr�culado, nome de 3 disciplinas que est� cursando
    // e as notas delas. Desenvolva um m�todo para verificar se o aluno est� aprovado (nota maior ou igual a 7)
    // numa determinada disciplina. Escreva um programa para testar essa classe, que pede as informa��es do aluno
    // ao usu�rio e ao final informa o nome das disciplinas, mostra as notas e se o aluno foi aprovado ou n�o.

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
            System.out.println("Disciplina n�o encontrada, tente novamente.");

    }

    void exibirDadosAluno(){
        System.out.println("\nDADOS DO ALUNO" +
                "\nNome: " + nome +
                "\nMatr�cula: " + matricula +
                "\nCurso: " + curso +
                "\nDisciplinas cursadas: ");

        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println(disciplinas[i] + " - Nota: " + notas[i] + " - Situa��o: " + situacaoDisciplina[i]);
        }
    }
}
