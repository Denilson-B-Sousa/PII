package lista01.exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number;

        System.out.println("Entre com um número: ");
        number = scanner.nextDouble();

        if(number > 0) {
            System.out.println("Número positivo.");
        } else if( number < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número igual a 0.");
        }
    }
}

/*
* 14.Positivo, negativo ou zero: Escreva um programa que leia um
número e determine se ele é positivo, negativo ou zero.

* */