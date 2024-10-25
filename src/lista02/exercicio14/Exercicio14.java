package lista02.exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int num = scanner.nextInt();

        System.out.println("Fatorial do número: " + fatorial(num));

    }

    public static int fatorial(int num) {

        if(num == 0 || num == 1) {
            return 1;
        }

        return num * fatorial(num-1);


    }
}
