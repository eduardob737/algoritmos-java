package br.com.eduardobarbosa.algoritmosjava.recursividade;

public class Exc2 {
    // Escreva um método recursivo e estático que receba um número inteiro positivo N e calcule o
    // somatório dos números de 1 a N.

    public static void main(String[] args) {
        System.out.println(somatorio(4));
    }

    public static int somatorio(int num) {
        if (num == 1) {
            return 1;
        }
        return num + somatorio(num - 1);
    }
}
