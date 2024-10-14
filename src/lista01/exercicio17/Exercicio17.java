package lista01.exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor do primeiro número: ");
        double number1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Entre com o valor do segundo número: ");
        double number2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Entre com o valor do terceiro número: ");
        double number3 = Double.parseDouble(scanner.nextLine());

        double maxNumber = Math.max(number1, Math.max(number2, number3));

        if (number1 == number2 && number2 == number3) {
            System.out.println("Todos os números são iguais!");
        } else {
            System.out.println("O maior número: " + maxNumber);
        }
    }
}
