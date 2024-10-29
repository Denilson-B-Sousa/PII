package lista02.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Entre com o segundo número: ");
        int secondNumber = scanner.nextInt();

        System.out.println("\n O maior número é: " + largestNumber(firstNumber, secondNumber));
    }

    public static int largestNumber(int firstNumber, int secondNumber) {

        return Math.max(firstNumber, secondNumber);
    }
}
