package br.com.eduardobarbosa.algoritmosjava.poo.iniciais;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc3 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = Utils.scanner.nextLine();

        System.out.print("Digite o curso: ");
        aluno.curso = Utils.scanner.nextLine();

        System.out.print("Digite a matrícula: ");
        aluno.matricula = Utils.scanner.nextInt();

        aluno.disciplinas = new String[3];
        aluno.notas = new float[3];
        aluno.situacaoDisciplina = new String[3];

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            Utils.scanner.nextLine();

            System.out.print("Digite a disciplina " + (i+1) + ": ");
            aluno.disciplinas[i] = Utils.scanner.nextLine();

            System.out.print("Digite a nota em " + aluno.disciplinas[i] + ": ");
            aluno.notas[i] = Utils.scanner.nextFloat();

            aluno.situacaoDisciplina[i] = aluno.notas[i] >= 7 ? "APROVADO" : "REPROVADO";
        }

        aluno.verificarSituacaoDisciplina("Algooritmos");
        aluno.exibirDadosAluno();

    }
}
