package lista02.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor de a: ");
        int a = scanner.nextInt();

        System.out.println("Entre com o valor de b: ");
        int b = scanner.nextInt();

        System.out.println("\nValor MDC: " + String.format("%.0f", calcularMDC(a, b)));


    }

    public static double calcularMDC(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return calcularMDC(b, a % b);
        }
    }
}
