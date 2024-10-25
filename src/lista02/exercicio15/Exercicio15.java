package lista02.exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número de termos da sequência fibonacci: ");
        int number = scanner.nextInt();

        for(int i = 0; i < number; i++){
            System.out.print(" " + fibonacci(i));
        }

    }

    public static int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
