package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.matrizes;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc5 {
    // Modifique o programa anterior de maneira a guardar os compromissos de
    // todo o ano, organizados por mês, dia e hora (só 8 horas por dia).

    public static void main(String[] args) {

        String[][][] agenda = new String[12][30][8];
        int mes, dia, hora;
        String compromisso;
        String repetirPrograma;

        do {
            System.out.print("Digite o número do mês: ");
            mes = Utils.scanner.nextInt();

            System.out.print("Digite o dia do mês: ");
            dia = Utils.scanner.nextInt();

            System.out.print("Digite a hora do dia: ");
            hora = Utils.scanner.nextInt();

            Utils.scanner.nextLine();

            System.out.print("Digite um novo compromisso ou C para consultar um compromisso existente: ");
            compromisso = Utils.scanner.nextLine();

            if (compromisso.equalsIgnoreCase("C")) {
                String compromissoAgendado = agenda[mes - 1][dia - 1][hora];
                if (compromissoAgendado == null) {
                    System.out.println("Nenhum compromisso agendado nesse dia e horário.");
                } else {
                    System.out.println("O compromisso agendado ás " + hora + "h do dia " + dia + " do mês " + mes + " é: " + compromissoAgendado);
                }
            } else {
                agenda[mes - 1][dia - 1][hora] = compromisso;
                System.out.println("Compromisso: " + compromisso + " agendado ás " + hora + "h do dia " + dia + " do mês " + mes);
            }

            System.out.print("\nDeseja repetir o programa? (S/N): ");
            repetirPrograma = Utils.scanner.nextLine();

        } while (repetirPrograma.equalsIgnoreCase("S"));

    }
}