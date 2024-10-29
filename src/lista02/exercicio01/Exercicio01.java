package lista02.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Entre com o segundo número:  ");
        int secondNumber = scanner.nextInt();

        System.out.println("Soma igual a: " + sum(firstNumber, secondNumber));

    }

    static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
