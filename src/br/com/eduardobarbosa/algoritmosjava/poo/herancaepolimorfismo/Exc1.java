package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class Exc1 {
    public static void main(String[] args) {

        String nome, tipoConta;
        int numConta, diaRendimento;
        float limite;
        int taxaRendimento;

        System.out.print("Digite o nome do titular da conta: ");
        nome = Utils.scanner.nextLine();

        do {
            System.out.print("Digite P para conta poupança ou E para conta especial: ");
            tipoConta = Utils.scanner.nextLine();

            if ((!tipoConta.equalsIgnoreCase("P")) && (!tipoConta.equalsIgnoreCase("E")))
                System.out.println("Dígito inválido, tente novamente.");

        } while (!tipoConta.equalsIgnoreCase("P") && !tipoConta.equalsIgnoreCase("E"));

        if (tipoConta.equalsIgnoreCase("P")) {
            numConta = Utils.random.nextInt(100);
            diaRendimento = Utils.random.nextInt(1, 29);
            taxaRendimento = Utils.random.nextInt(3, 11);
            ContaPoupanca conta = new ContaPoupanca(nome, numConta, diaRendimento);

            System.out.println("Parabéns, sua conta poupança foi criada com sucesso!");
            menuConta(conta, taxaRendimento);

        } else {
            numConta = Utils.random.nextInt(100, 200);
            limite = Utils.random.nextInt(500, 2001);
            ContaEspecial conta = new ContaEspecial(nome, numConta, limite);

            System.out.println("Parabéns, sua conta especial foi criada com sucesso!");
            menuConta(conta);
        }
    }

    private static void menuConta(ContaPoupanca conta, int taxa){
        String opcao;

        do {
            System.out.println("\nEscolha uma das opções a seguir");
            System.out.println("C para consultar saldo || S para sacar || D para depositar || R para ver novo saldo com rendimento || E para exibir dados de sua conta || X para sair: ");
            opcao = Utils.scanner.next();

            switch (opcao) {
                case "C":
                case "c":
                    System.out.println("Saldo da conta: R$ " + Utils.mask.format(conta.consultarSaldo()));
                    break;

                case "S":
                case "s":
                    System.out.print("Digite o valor do saque: ");
                    float saque = Utils.scanner.nextFloat();
                    conta.sacar(saque);
                    break;

                case "D":
                case "d":
                    System.out.print("Digite o valor de depósito: ");
                    float deposito = Utils.scanner.nextFloat();
                    conta.depositar(deposito);
                    break;

                case "R":
                case "r":
                    System.out.println("Saldo antigo: R$ " + Utils.mask.format(conta.getSaldo()));
                    System.out.println("Taxa de rendimento: " + Utils.mask.format(taxa) + "%");
                    System.out.println("Novo saldo: R$ " + Utils.mask.format(conta.calcularNovoSaldo(taxa)));
                    break;

                case "E":
                case "e":
                    System.out.println(conta.toString());
                    break;

                case "X":
                case "x":
                    System.out.println("Obrigado, até a próxima :)");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (!opcao.equalsIgnoreCase("x"));
    }
    private static void menuConta(ContaEspecial conta){
        String opcao;

        do {
            System.out.println("\nEscolha uma das opções a seguir");
            System.out.println("C para consultar saldo || S para sacar || D para depositar || E para exibir dados de sua conta || X para sair: ");
            opcao = Utils.scanner.next();

            switch (opcao) {
                case "C":
                case "c":
                    System.out.println("Saldo da conta: R$ " + Utils.mask.format(conta.consultarSaldo()));
                    break;

                case "S":
                case "s":
                    System.out.print("Digite o valor do saque: ");
                    float saque = Utils.scanner.nextFloat();
                    conta.sacar(saque);
                    break;

                case "D":
                case "d":
                    System.out.print("Digite o valor de depósito: ");
                    float deposito = Utils.scanner.nextFloat();
                    conta.depositar(deposito);
                    break;

                case "E":
                case "e":
                    System.out.println(conta.toString());
                    break;

                case "X":
                case "x":
                    System.out.println("Obrigado, até a próxima :)");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (!opcao.equalsIgnoreCase("x"));
    }
}