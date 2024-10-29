package lista02.exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double value;

        System.out.println("Entre com um número: ");
        value = scanner.nextDouble();

        System.out.println("\n Quadrado do número: " + String.format("%.0f" , calculateSquare(value)));

    }

    public static double calculateSquare(double number) {
        return Math.pow(number, 2);
    }
}
