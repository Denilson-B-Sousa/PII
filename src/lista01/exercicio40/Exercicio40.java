package lista01.exercicio40;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite os 10 elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[9 - i];
            vetor[9 - i] = temp;
        }

        System.out.println("Vetor após a troca:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}
