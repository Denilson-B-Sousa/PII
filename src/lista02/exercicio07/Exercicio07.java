package lista02.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsiusTemperature;

        System.out.println("Entre com a temperatura em Celsius: ");
        celsiusTemperature = scanner.nextDouble();

        System.out.println("Temperatura em Fahrenheit: " + temperatureConversion(celsiusTemperature) + " °F");

    }

    public static double temperatureConversion(double celsius) {

        return (celsius * 1.8) + 32;

    }
}
