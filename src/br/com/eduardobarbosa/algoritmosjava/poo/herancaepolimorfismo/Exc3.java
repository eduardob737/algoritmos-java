package br.com.eduardobarbosa.algoritmosjava.poo.herancaepolimorfismo;

public class Exc3 {
    public static void main(String[] args) {

        Mamifero camelo = new Mamifero("Camelo", 150, "Amarelo", 2);
        Peixe tubarao = new Peixe("Tubarão", 300, 1.5f);
        Mamifero urso = new Mamifero("Urso-do-Canadá", 180, "Vermelho", 0.5f);

        camelo.setAlimento("");
        urso.setAlimento("Mel");

        System.out.println(camelo);
        System.out.println(tubarao);
        System.out.println(urso);
    }
}
