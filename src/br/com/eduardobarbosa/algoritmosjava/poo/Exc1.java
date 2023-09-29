package br.com.eduardobarbosa.algoritmosjava.poo;

public class Exc1 {

    public static void main(String[] args) {
        Lampada lampLed = new Lampada();
        lampLed.marca =  "Philips";
        lampLed.cor = "Branca";
        lampLed.potencia = 13f;
        lampLed.tipo = "LED";
        lampLed.tensao = 100;

        lampLed.acenderLampada(lampLed);
        lampLed.apagarLampada(lampLed);

    }
}
