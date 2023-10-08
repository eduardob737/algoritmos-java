package br.com.eduardobarbosa.algoritmosjava.programacaoestruturada;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
public class Utils {

    public static Scanner scanner = new Scanner(System.in);
    public static DecimalFormat mask = new DecimalFormat("#,000.00");
    public static DecimalFormat maskMedidas = new DecimalFormat("0.00");
    public static Random random = new Random();

    public static double formatDecimalsNumbers(double number){
        int numInt = (int) number;
        String numString = String.valueOf(number);
        String[] grupoDecimais = numString.split("\\.");
        char[] ultimosDecimais = grupoDecimais[1].toCharArray();
        String decimaisFiltrados = String.valueOf(ultimosDecimais[0]).concat(String.valueOf(ultimosDecimais[1]));
        int decimaisInt = Integer.parseInt(decimaisFiltrados);
        double doubleDecimais = (double) decimaisInt / 100;
        return doubleDecimais + numInt;
    }
}
