package lista01.exercicio23;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        long result = 1;

        System.out.println("Entre com um número inteiro: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(result + " × " + i + " = ");

            result *= i;
        }

        System.out.println("Fatorial de " + number + " = " + result);
    }
}