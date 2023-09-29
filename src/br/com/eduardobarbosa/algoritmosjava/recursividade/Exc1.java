package br.com.eduardobarbosa.algoritmosjava.recursividade;

public class Exc1 {
    // Escreva um m�todo recursivo e est�tico que calcule e retorne o N-�simo termo da sequ�ncia Fibonacci.
    // Alguns n�meros desta sequ�ncia s�o: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

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