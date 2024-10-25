package lista02.exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int numberThree;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor do primeiro número: ");
        numberOne = scanner.nextInt();

        System.out.println("Entre com o valor do segundo número: ");
        numberTwo = scanner.nextInt();

        System.out.println("Entre com o valor do terceiro número: ");
        numberThree = scanner.nextInt();

        System.out.println("\nMédia: " + CalcularMedia(numberOne, numberTwo, numberThree));

    }

    public static double CalcularMedia(int numberOne, int numberTwo, int numberThree) {

        return (numberOne + numberTwo + numberThree) / 3;
    }


}
