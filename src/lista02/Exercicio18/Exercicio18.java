package lista02.Exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a base da potência: ");
        double base = scanner.nextDouble();

        System.out.println("Entre com o expoente da potência: ");
        double exponent = scanner.nextDouble();

        System.out.println("Potência " + String.format("%.0f", base) + " ^ " + String.format("%.0f" , exponent) + " = " + String.format("%.0f" , calculatePow(base, exponent)));

    }

    public static double calculatePow(double base, double exponent) {

        return (exponent == 0) ? 1 : base * calculatePow(base, exponent - 1);

    }
}
