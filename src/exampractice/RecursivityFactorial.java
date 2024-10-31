package exampractice;

import java.util.Scanner;

public class RecursivityFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int number = scanner.nextInt();

        System.out.println("Fatorial: " + number + " = " + factorial(number));

    }

    public static int factorial(int number) {

        //condição de parada
        return (number < 2) ? 1 : number * factorial(number - 1);

    }
}
