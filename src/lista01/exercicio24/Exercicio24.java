package lista01.exercicio24;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if(number <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não é um número primo.");
        }
    }
}