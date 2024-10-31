package exampractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro: ");
        int number = scanner.nextInt();

        System.out.println("Fatorial do número " + number + " = " + factorial(number));


    }

    public static int factorial(int number) {

        int factorial = 1;

        for(int i = 1; i<=number;i++) {
            factorial *= i;
        }

        return factorial;
    }
}
