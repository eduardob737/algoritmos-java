package br.com.eduardobarbosa.algoritmosjava.exceptions;

public class Excecao {
    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Esse texto n�o ser� impresso.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe.");
        }
    }
}
