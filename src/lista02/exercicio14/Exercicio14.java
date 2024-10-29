package lista02.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Entre com um número inteiro: ");
        number = scanner.nextInt();

        System.out.println("Fatorial do número: " + factorial(number));

    }

    public static int factorial(int number) {

        if(number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);


    }
}
