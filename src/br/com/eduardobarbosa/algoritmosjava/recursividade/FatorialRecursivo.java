package br.com.eduardobarbosa.algoritmosjava.recursividade;

public class FatorialRecursivo {

    public static int fatorial (int num){
        if (num == 0)
            return 1;

        return num * fatorial(num - 1);
        // num = 5 * chama funcao com 4 (5 * 4)
        // num = 20 * chama funcao com 3 (20 * 3)
        // num = 60 * chama funcao com 2 (60 * 2)
        // num = 120 * chama funcao com 1 (120 * 1)
        // num = 120 * chama funcao com 0
        // num = 120 * 1 = 120

    }

    public static void main(String[] args) {

        System.out.println(fatorial(5));

    }
}
