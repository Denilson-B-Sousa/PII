package lista01.exercicio26;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a quantidade de números da sequência: ");
        int number = scanner.nextInt();
        int termOne = 0;
        int termTwo = 1;
        int nextTerm;

        System.out.print(termOne + " " + termTwo + " ");

        for (int i = 1; i < number; i++) {

            nextTerm = termOne + termTwo;
            System.out.print(nextTerm + " ");
            termOne = termTwo;
            termTwo = nextTerm;

        }

        scanner.close();
    }
}
