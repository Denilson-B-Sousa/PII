package lista01.exercicio22;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Entre com um número inteiro N: ");
        number = scanner.nextInt();

        System.out.println("Soma de todos números de 1 até " + number + ": ");
        for(int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.println("Somatório = " + sum);
    }
}
/*
* 22.Soma dos números de 1 a N: Construa um programa que leia um
número N e calcule a soma de todos os números de 1 até N.

* */