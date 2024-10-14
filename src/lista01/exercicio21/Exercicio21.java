package lista01.exercicio21;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Entre com um número inteiro: ");
        number = scanner.nextInt();

        System.out.println("Tabuada do número fornecido: ");
        for(int i = 0; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
