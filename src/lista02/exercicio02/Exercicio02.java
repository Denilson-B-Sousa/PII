package lista02.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Entre com um número inteiro: ");
        number = scanner.nextInt();


        System.out.println(VerificarPar(number));

    }

    public static boolean VerificarPar(int number) {

        return (number % 2 == 0);

    }
}
