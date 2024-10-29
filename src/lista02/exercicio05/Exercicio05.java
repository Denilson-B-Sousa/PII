package lista02.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int number = scanner.nextInt();

        System.out.println("\n" + IsPrime(number));
    }

    public static boolean IsPrime(int number) {
        boolean isPrime = true;

        if(number <= 1) {
           isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if (number % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }


}
