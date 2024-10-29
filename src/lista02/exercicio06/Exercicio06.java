package lista02.exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor do primeiro número: ");
        firstNumber = scanner.nextInt();

        System.out.println("Entre com o valor do segundo número: ");
        secondNumber = scanner.nextInt();

        System.out.println("Entre com o valor do terceiro número: ");
        thirdNumber = scanner.nextInt();

        System.out.println("\nMédia: " + CalculateAverage(firstNumber, secondNumber, thirdNumber));

    }

    public static double CalculateAverage(int firstNumber, int secondNumber, int thirdNumber) {

        return (double) (firstNumber + secondNumber + thirdNumber) / 3;
    }


}
