package lista02.exercicio07;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextInt();

        System.out.println("Temperatura em Fahrenheit: " + ConversaoTemperatura(temperaturaCelsius) + "°F");

    }

    public static double ConversaoTemperatura(double celsius) {

        return (celsius * 1.8) + 32;

    }
}
