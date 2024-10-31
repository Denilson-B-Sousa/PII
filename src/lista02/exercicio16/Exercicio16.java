package lista02.exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Entre com o valor de N: ");
        n = scanner.nextInt();

        System.out.println("Somatório de 1 a " + n + " = " + add(n));

    }

    public static int add(int n) {

        return (n == 1) ? 1 : n + add(n - 1);

    }
}
