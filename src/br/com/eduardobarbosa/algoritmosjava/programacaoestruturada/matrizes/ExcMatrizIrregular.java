package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.matrizes;

import br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.Utils;

public class ExcMatrizIrregular {
    // Escreva um programa para guardar dados de uma pesquisa feita com uma amostra de pessoas
    // da avenida mais movimentada da cidade onde você mora. A pesquisa consiste em perguntar
    // ao cidadão a quantidade de filhos e o nome de cada filho. Guarde essas informações em
    // uma matriz de forma que cada pessoa entrevistada ocupe somente o espaço necessário na
    // memória para guardar os nomes dos filhos. Imprima a quantidade de pessoas entrevistadas,
    // a quantidade de filhos de cada entrevistado e os respectivos nomes dos filhos.

    public static void main(String[] args) {

        int qtdPessoasEntrevistadas;
        String[][] pesquisa;

        System.out.print("Digite a quantidade de pessoas entrevistadas: ");
        qtdPessoasEntrevistadas = Utils.scanner.nextInt();

        pesquisa = new String[qtdPessoasEntrevistadas][];

        System.out.println();

        for (int i = 0; i < pesquisa.length; i++){
            System.out.print("Digite a quantidade de filhos do entrevistado " + (i+1) + ": ");
            pesquisa[i] = new String[Utils.scanner.nextInt()];

            Utils.scanner.nextLine();

            for (int j = 0; j < pesquisa[i].length; j++){
                System.out.print("Digite o nome do filho " + (j+1) + ": ");
                pesquisa[i][j] = Utils.scanner.nextLine();
            }
        }

        System.out.println("\nPessoas entrevistadas: " + pesquisa.length);

        for (int i = 0; i < pesquisa.length; i++){
            System.out.println();
            System.out.println("Qtd de filhos do entrevistado " + (i+1) + ": " + pesquisa[i].length);

            if (pesquisa[i].length > 0){
                for (int j = 0; j < pesquisa[i].length; j++){
                    System.out.println("Filho " + (j+1) + ": " + pesquisa[i][j]);
                }
            }
        }
    }
}
