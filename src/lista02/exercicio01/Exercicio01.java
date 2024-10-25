package lista02.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        int numberOne = scanner.nextInt();
        System.out.println("Entre com o segundo número:  ");
        int numberTwo = scanner.nextInt();

        System.out.println("Soma igual a: " + sum(numberOne, numberTwo));

    }

    static int sum(int a, int b) {
        return a + b;
    }
}
