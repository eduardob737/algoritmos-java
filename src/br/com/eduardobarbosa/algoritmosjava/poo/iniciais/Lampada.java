package br.com.eduardobarbosa.algoritmosjava.poo.iniciais;

public class Lampada {
    // Exc1 - Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar e desligar a lâmpada.
    String marca;
    String tipo;
    String cor;
    float potencia;
    int tensao;

    void acenderLampada(Lampada lampada){
        System.out.println("Lâmpada " + lampada.tipo + " " + lampada.marca  + " " + lampada.cor  + " " + lampada.tensao  + "V " + lampada.potencia + "W -> Status: ACESSA");
    }

    void apagarLampada(Lampada lampada){
        System.out.println("Lâmpada " + lampada.tipo + " " + lampada.marca  + " " + lampada.cor  + " " + lampada.tensao  + "V " + lampada.potencia + "W -> Status: APAGADA");
    }

}
