package lista01.exercicio31;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double sum = 0;

        System.out.println("Entre com dez números inteiros ou decimais: ");

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Vetor[ " + (i + 1) + " ] = ");
            numbers[i] = scanner.nextDouble();

            sum += numbers[i];
        }

        System.out.println("Soma dos elementos do vetor: " + String.format("%.1f" , sum));


    }
}

/*
* Soma de elementos de um vetor: Faça um programa que leia 10
números e armazene em um vetor. Depois, exiba a soma dos
elementos do vetor.

*  */