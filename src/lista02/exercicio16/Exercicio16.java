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

        if(n == 1) {
            return 1;
        } else {
            return n + add(n - 1);
        }

    }
}
