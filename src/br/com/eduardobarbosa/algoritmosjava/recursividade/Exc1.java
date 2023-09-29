package br.com.eduardobarbosa.algoritmosjava.recursividade;

public class Exc1 {
    // Escreva um método recursivo e estático que calcule e retorne o N-ésimo termo da sequência Fibonacci.
    // Alguns números desta sequência são: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int num) {
        if (num < 2) {
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }

}