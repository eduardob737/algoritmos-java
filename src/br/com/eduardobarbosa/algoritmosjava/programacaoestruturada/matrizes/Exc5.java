package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.matrizes;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc5 {
    // Modifique o programa anterior de maneira a guardar os compromissos de
    // todo o ano, organizados por m�s, dia e hora (s� 8 horas por dia).

    public static void main(String[] args) {

        String[][][] agenda = new String[12][30][8];
        int mes, dia, hora;
        String compromisso;
        String repetirPrograma;

        do {
            System.out.print("Digite o n�mero do m�s: ");
            mes = Utils.scanner.nextInt();

            System.out.print("Digite o dia do m�s: ");
            dia = Utils.scanner.nextInt();

            System.out.print("Digite a hora do dia: ");
            hora = Utils.scanner.nextInt();

            Utils.scanner.nextLine();

            System.out.print("Digite um novo compromisso ou C para consultar um compromisso existente: ");
            compromisso = Utils.scanner.nextLine();

            if (compromisso.equalsIgnoreCase("C")) {
                String compromissoAgendado = agenda[mes - 1][dia - 1][hora];
                if (compromissoAgendado == null) {
                    System.out.println("Nenhum compromisso agendado nesse dia e hor�rio.");
                } else {
                    System.out.println("O compromisso agendado �s " + hora + "h do dia " + dia + " do m�s " + mes + " �: " + compromissoAgendado);
                }
            } else {
                agenda[mes - 1][dia - 1][hora] = compromisso;
                System.out.println("Compromisso: " + compromisso + " agendado �s " + hora + "h do dia " + dia + " do m�s " + mes);
            }

            System.out.print("\nDeseja repetir o programa? (S/N): ");
            repetirPrograma = Utils.scanner.nextLine();

        } while (repetirPrograma.equalsIgnoreCase("S"));

    }
}