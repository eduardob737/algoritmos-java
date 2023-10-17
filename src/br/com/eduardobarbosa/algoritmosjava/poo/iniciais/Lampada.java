package br.com.eduardobarbosa.algoritmosjava.poo.iniciais;

public class Lampada {
    // Exc1 - Escreva uma classe para representar uma l�mpada. Desenvolva m�todos para ligar e desligar a l�mpada.
    String marca;
    String tipo;
    String cor;
    float potencia;
    int tensao;

    void acenderLampada(Lampada lampada){
        System.out.println("L�mpada " + lampada.tipo + " " + lampada.marca  + " " + lampada.cor  + " " + lampada.tensao  + "V " + lampada.potencia + "W -> Status: ACESSA");
    }

    void apagarLampada(Lampada lampada){
        System.out.println("L�mpada " + lampada.tipo + " " + lampada.marca  + " " + lampada.cor  + " " + lampada.tensao  + "V " + lampada.potencia + "W -> Status: APAGADA");
    }

}
