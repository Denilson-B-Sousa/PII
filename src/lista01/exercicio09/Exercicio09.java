package lista01.exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o dividendo: número inteiro");
        int dividendo = scanner.nextInt();

        System.out.println("Entre com o divisor: número inteiro");
        int divisor = scanner.nextInt();

        double quociente = (double) dividendo / divisor;
        int resto = dividendo % divisor;

        System.out.println("Quociente da divisão: " + String.format("%.0f", quociente));
        System.out.println("Resto da divisão: " + resto);



    }
}

/*
* 9. Divisão e resto: Escreva um programa que leia dois números inteiros
e mostre o quociente e o resto da divisão.
*
* */