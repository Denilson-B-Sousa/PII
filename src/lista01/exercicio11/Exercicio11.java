package lista01.exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }


    }
}

/*
11.Número par ou ímpar: Faça um programa que leia um número e
diga se ele é par ou ímpar.
 */