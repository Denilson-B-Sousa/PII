package lista01.exercicio35;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrayOne[] = new int[5];
        int arrayTwo[] = new int[5];
        int resultingArray[] = new int[5];

        System.out.println("Entre com os valores do vetor 1: ");
        for(int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = scanner.nextInt();

        }

        System.out.println("\nEntre com os valores do vetor 2: ");
        for(int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = scanner.nextInt();

        }

        System.out.println("Entre com os valores do vetor 1: ");
        for(int i = 0; i < resultingArray.length; i++) {
            resultingArray[i] = arrayOne[i] * arrayTwo[i];

            System.out.println(arrayOne[i] + " * " + arrayTwo[i] + " = " + resultingArray[i]);
        }


    }
}
