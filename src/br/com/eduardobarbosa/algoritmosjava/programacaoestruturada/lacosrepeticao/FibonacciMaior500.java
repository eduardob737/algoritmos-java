package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada.lacosrepeticao;

public class FibonacciMaior500 {

    // A série de Fibonacci é formada pela sequência 0, 1,1,2,3,5,8,13,21,34,55,..
    // Faça um programa de Fibonacci que gere a série até  que o valor seja maior que 500.

    public static void main(String[] args) {

        int primeiro, segundo, proximo = 0;
        primeiro = 0;
        segundo = 1;

        System.out.print(primeiro);
        System.out.print(" " + segundo);

        while (proximo <= 500){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.print(" " + proximo);
        }

        /* Usando ArrayList

        ArrayList<Integer> sequencia = new ArrayList<>();
        sequencia.add(0);
        sequencia.add(1);

        System.out.print(sequencia.get(0) + ", " + sequencia.get(1));

        int i = 2;
        int ultimo = 1;

        while (sequencia.get(ultimo) <= 500) {
            sequencia.add(sequencia.get(i - 1) + sequencia.get(i - 2));
            System.out.print(", " + sequencia.get(i));
            i++;
            ultimo = sequencia.size() - 1;
        }*/
    }
}