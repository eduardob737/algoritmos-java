package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.matrizes;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc4 {
    // Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal.
    // Cada dia do mês deve conter 24 horas, onde para cada uma destas 24 horas podemos
    // associar uma tarefa específica (compromisso agendado). O programa deve ter um menu
    // onde o usuário indica o dia do mês que deseja alterar e a hora, entrando em seguida
    // com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o
    // dia e a hora para obter o compromisso armazenado.

    public static void main(String[] args) {

        String[][] agenda = new String[31][24];
        int dia, hora;
        String compromisso;
        String repetirPrograma;

        do {
            System.out.print("Digite o dia do mês: ");
            dia = Utils.scanner.nextInt();

            System.out.print("Digite a hora do dia: ");
            hora = Utils.scanner.nextInt();

            Utils.scanner.nextLine();

            System.out.print("Digite um novo compromisso ou C para consultar um compromisso existente: ");
            compromisso = Utils.scanner.nextLine();

            if (compromisso.equalsIgnoreCase("C")) {
                String compromissoAgendado = agenda[dia - 1][hora];
                if (compromissoAgendado == null) {
                    System.out.println("Nenhum compromisso agendado nesse dia e horário.");
                } else {
                    System.out.println("O compromisso agendado no dia " + dia + " ás " + hora + "h é: " + compromissoAgendado);
                }
            } else {
                agenda[dia - 1][hora] = compromisso;
                System.out.println("Compromisso " + compromisso + " agendado no dia " + dia + " ás " + hora + "h.");
            }

            System.out.print("\nDeseja repetir o programa? (S/N): ");
            repetirPrograma = Utils.scanner.nextLine();

        } while (repetirPrograma.equalsIgnoreCase("S"));

    }
}