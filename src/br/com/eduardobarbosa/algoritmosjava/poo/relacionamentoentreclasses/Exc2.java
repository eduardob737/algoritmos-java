package br.com.eduardobarbosa.algoritmosjava.poo.relacionamentoentreclasses;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc2 {
    // Escreva uma classe para representar um Curso, com nome e hor�rio. Cada curso tem um Professor,
    // que possui nome, departamento e email. Cada curso tamb�m pode ter v�rios alunos (tipo Aluno).
    // Cada Aluno tem nome, matr�cula e 4 notas. Escreva um programa teste que crie um Curso com 5 alunos,
    // e que pe�a ao usu�rio que entre com as 4 notas de cada aluno. Ao final, imprima a m�dia de cada aluno,
    // se o mesmo est� aprovado (m�dia maior ou igual a 7), e qual � a m�dia da turma.

    public static void main(String[] args) {

        float somaMediaAlunos = 0;
        float mediaTurma;

        Curso curso = new Curso();
        Professor professor = new Professor();
        Aluno[] alunos = new Aluno[5];

        System.out.println("DADOS DO CURSO");
        System.out.print("Digite o nome do curso: ");
        curso.setNome(Utils.scanner.nextLine());

        System.out.print("Digite o hor�rio do curso: ");
        curso.setHorario(Utils.scanner.nextLine());

        System.out.println("DADOS DO PROFESSOR");
        System.out.print("Digite o nome do professor do curso: ");
        professor.setNome(Utils.scanner.nextLine());

        System.out.print("Digite o departamento do professor: ");
        professor.setDepartamento(Utils.scanner.nextLine());

        System.out.print("Digite o email do professor: ");
        professor.setEmail(Utils.scanner.nextLine());

        curso.setProfessor(professor);

        System.out.println("\nDADOS DO ALUNO");

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();
            float[] notas = new float[4];

            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            aluno.setNome(Utils.scanner.nextLine());

            System.out.print("Digite o n� de matricula do aluno " + aluno.getNome() + ": ");
            aluno.setMatricula(Utils.scanner.nextInt());

            for (int j = 0; j < aluno.getNotas().length; j++) {
                System.out.print("Digite a nota " + (j+1) + " do aluno " + aluno.getNome() + ": ");
                notas[j] = Utils.scanner.nextFloat();
            }

            Utils.scanner.nextLine();
            System.out.println();

            aluno.setNotas(notas);
            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        System.out.println("M�DIA DOS ALUNOS");

        for (int i = 0; i < curso.getAlunos().length; i++) {
            somaMediaAlunos += curso.getAlunos()[i].getMediaAluno();
            System.out.println(curso.getAlunos()[i].getNome() + " | M�dia: " + Utils.mask.format(curso.getAlunos()[i].getMediaAluno()) + " | Situa��o: " + curso.getAlunos()[i].getSituacaoAluno());
        }

        mediaTurma = somaMediaAlunos / curso.getAlunos().length;

        System.out.println("\nM�dia da turma: " + Utils.mask.format(mediaTurma));
    }
}