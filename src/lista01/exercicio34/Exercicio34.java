package lista01.exercicio34;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array[] = new int[30];
        int counterPair = 0;

        System.out.println("Entre com 30 números inteiros: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            if(array[i] % 2 == 0) {
                counterPair++;
            }
        }

        System.out.println("Quantidade de números pares: " + counterPair);
    }
}
