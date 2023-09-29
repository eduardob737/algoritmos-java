package br.com.eduardobarbosa.algoritmosjava.recursividade;

public class Exc2 {
    // Escreva um m�todo recursivo e est�tico que receba um n�mero inteiro positivo N e calcule o
    // somat�rio dos n�meros de 1 a N.

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
