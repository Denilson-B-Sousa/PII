package lista01.exercicio29;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int number = Integer.parseInt(scanner.nextLine());
        int perfectNumber = 0;

        for(int i = 1; i <= number / 2; i++) {

            if(number % i == 0) {
                perfectNumber += i;
            }

        }

        if(perfectNumber == number) {
            System.out.println("Número perfeito: " + perfectNumber);
        } else {
            System.out.println("Não é um número perfeito: " + perfectNumber);
        }
    }
}
