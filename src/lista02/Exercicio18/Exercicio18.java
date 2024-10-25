package lista02.Exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a base da potência: ");
        double base = scanner.nextDouble();

        System.out.println("Entre com o expoente da potência: ");
        double expoente = scanner.nextDouble();

        System.out.println("Potência " + String.format("%.0f", base) + " ^ " + String.format("%.0f" , expoente) + " = " + String.format("%.0f" , CalcularPotencia(base, expoente)));

    }

    public static double CalcularPotencia(double base, double expoente) {

        return Math.pow(base, expoente);

    }
}
