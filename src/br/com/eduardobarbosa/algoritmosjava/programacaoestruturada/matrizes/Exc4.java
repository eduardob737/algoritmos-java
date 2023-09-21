package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.matrizes;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc4 {
    // Fa�a um programa para armazenar em uma matriz os compromissos de uma agenda pessoal.
    // Cada dia do m�s deve conter 24 horas, onde para cada uma destas 24 horas podemos
    // associar uma tarefa espec�fica (compromisso agendado). O programa deve ter um menu
    // onde o usu�rio indica o dia do m�s que deseja alterar e a hora, entrando em seguida
    // com o compromisso, ou ent�o, o usu�rio pode tamb�m consultar a agenda, fornecendo o
    // dia e a hora para obter o compromisso armazenado.

    public static void main(String[] args) {

        String[][] agenda = new String[31][24];
        int dia, hora;
        String compromisso;
        String repetirPrograma;

        do {
            System.out.print("Digite o dia do m�s: ");
            dia = Utils.scanner.nextInt();

            System.out.print("Digite a hora do dia: ");
            hora = Utils.scanner.nextInt();

            Utils.scanner.nextLine();

            System.out.print("Digite um novo compromisso ou C para consultar um compromisso existente: ");
            compromisso = Utils.scanner.nextLine();

            if (compromisso.equalsIgnoreCase("C")) {
                String compromissoAgendado = agenda[dia - 1][hora];
                if (compromissoAgendado == null) {
                    System.out.println("Nenhum compromisso agendado nesse dia e hor�rio.");
                } else {
                    System.out.println("O compromisso agendado no dia " + dia + " �s " + hora + "h �: " + compromissoAgendado);
                }
            } else {
                agenda[dia - 1][hora] = compromisso;
                System.out.println("Compromisso " + compromisso + " agendado no dia " + dia + " �s " + hora + "h.");
            }

            System.out.print("\nDeseja repetir o programa? (S/N): ");
            repetirPrograma = Utils.scanner.nextLine();

        } while (repetirPrograma.equalsIgnoreCase("S"));

    }
}