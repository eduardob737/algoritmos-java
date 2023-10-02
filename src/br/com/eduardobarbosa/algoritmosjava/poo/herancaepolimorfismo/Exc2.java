package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

public class Exc2 {
    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica("Eduardo", 2595);
        PessoaFisica pf2 = new PessoaFisica("Carlos", 6795);
        PessoaFisica pf3 = new PessoaFisica("Patrick", 9795);

        PessoaJuridica pj1 = new PessoaJuridica("Nike", 54859);
        PessoaJuridica pj2 = new PessoaJuridica("Adidas", 88059);
        PessoaJuridica pj3 = new PessoaJuridica("Mizuno", 1255859);

        pf1.calculoImposto();
        pf2.calculoImposto();
        pf3.calculoImposto();
        pj1.calculoImposto();
        pj2.calculoImposto();
        pj3.calculoImposto();

        System.out.println(pf1);
        System.out.println(pf2);
        System.out.println(pf3);
        System.out.println(pj1);
        System.out.println(pj2);
        System.out.println(pj3);
    }
}
