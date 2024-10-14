package lista01.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius: ");
        double celsius = scanner.nextInt();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura em Fahrenheit: " + String.format("%.1f", fahrenheit) + "°F");

    }
}

/*
* Conversão de temperatura: Construa um programa que converta
uma temperatura de Celsius para Fahrenheit
*
*  */
