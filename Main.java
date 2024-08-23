//Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
//F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double K, F, Re, Ra;


        System.out.println("Qual temperatura em Celsius? ");
        int C = sc.nextInt();
        F = C*1.8+32;
        K = C+273.15;
        Re = C*0.8;
        Ra = C*1.8 + 32 +459.67;

        System.out.println("Temperatura em Fahrenheit: " + F);
        System.out.println("Temperatura em Kelvin: " + K);
        System.out.println("Temperatura em Réaumur: " + Re);
        System.out.println("Temperatura em Rankine: " + Ra);







    }

}