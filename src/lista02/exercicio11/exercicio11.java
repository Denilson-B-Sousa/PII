package lista02.exercicio11;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        double value = scanner.nextDouble();

        System.out.println("\nQuadrado do número: " + String.format("%.0f" , calcularQuadrado(value)));

    }

    public static double calcularQuadrado(double number) {
        return Math.pow(number, 2);
    }
}
