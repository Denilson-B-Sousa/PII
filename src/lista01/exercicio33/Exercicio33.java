package lista01.exercicio33;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array[] = new int[5];
        int sum = 0;
        double average = 0;

        System.out.println("Entre com 20 números inteiros: ");
        for(int i = 0; i < array.length; i++){

            array[i] = scanner.nextInt();

            sum += array[i];

        }

        average = (double) sum / 5;
        System.out.printf("Média dos elementos = %.2f%n", average);
    }
}
