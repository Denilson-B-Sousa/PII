package lista01.exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Entre com o valor do primeiro número: ");
        number1 = scanner.nextInt();

        System.out.println("Entre com o valor do segundo número: ");
        number2 = scanner.nextInt();

        if(number1 % number2 == 0) {
            System.out.println("Número múltiplo.");
        } else {
            System.out.println("Números não são múltiplos.");
        }
    }
}

/*
* 18.Verificação de múltiplos: Faça um programa que leia dois números
inteiros e diga se o primeiro é múltiplo do segundo.
* */