package lista01.exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com primeiro número: ");
        int number = scanner.nextInt();

        System.out.println("Entre com o segundo número: ");
        int number2 = scanner.nextInt();

        if(number > number2) {
            System.out.println("\n" + number + " > " + number2);
        } else {
            System.out.println("\n" + number + " < " + number2);

        }
    }
}
