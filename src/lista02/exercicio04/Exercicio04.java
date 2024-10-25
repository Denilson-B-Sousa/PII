package lista02.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int numberOne = scanner.nextInt();

        System.out.println("Entre com o segundo número: ");
        int numberTwo = scanner.nextInt();

        System.out.println("O maior número é: " + maiorNumero(numberOne, numberTwo));
    }

    public static int maiorNumero(int numberOne, int numberTwo) {

        int largestNumber = (numberOne > numberTwo) ? numberOne : numberTwo;

        return largestNumber;
    }
}
