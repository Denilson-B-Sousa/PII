package lista02.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int number = scanner.nextInt();

        System.out.println("Fatorial igual: " + Fatorial(number));

    }

    public static int Fatorial(int number) {

        int factorial = 1;

        for (int i = 2; i <= number; i++) {

            factorial *= i;

        }

        return factorial;

    }

}
