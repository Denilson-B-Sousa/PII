package concepts.aula02.examples;

import concepts.function.Sum;

import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println("Entre com o valor de n: ");
        number = scanner.nextInt();

        System.out.println("Somatório de 1 até n: " + sum(number));
    }

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }

        return n  + sum(n - 1); // retorna a soma do número + número anterior
    }

}
