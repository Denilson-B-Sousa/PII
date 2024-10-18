package aula01;

import java.util.Scanner;

public class Recursividade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne;
        int numberTwo;

        System.out.println("Entre com o primeiro valor: ");
        numberOne = scanner.nextInt();

        System.out.println("Entre com o segundo valor: ");
        numberTwo = scanner.nextInt();

        int total = Sum(numberOne, numberTwo);
        printResult(total);
    }

    static int Sum(int a, int b) {
        return a + b;
    }

    public static void printResult(int sum) {
        System.out.println("O valor da soma e: " + sum);
    }
}
