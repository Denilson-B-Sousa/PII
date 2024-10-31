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

        return (number == 0) ? 0 : (number == 1) ? 1 : fibonacci(number - 1) + fibonacci(number - 2);
    }
}
