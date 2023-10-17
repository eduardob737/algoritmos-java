package br.com.eduardobarbosa.algoritmosjava.exceptions;

public class MultiplosCatchs {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i=0; i< numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
            } catch (ArithmeticException exception1){
                System.out.println("Erro ao dividir por 0");
            }
            catch (ArrayIndexOutOfBoundsException exception2){
                System.out.println("Exceção ao acessar um índice do vetor que não existe");
            }
        }
    }
}
