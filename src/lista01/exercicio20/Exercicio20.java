package lista01.exercicio20;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");
        int age = scanner.nextInt();

        if(age >= 18 ) {
            System.out.println("Você está apto a votação.");
        } else if (age == 16 || age == 17) {
            System.out.println("Votação Facultativa.");
        } else {
            System.out.println("Você não está apto a votação.");
        }

    }
}

/*
* 20. Verificação de idade para votar: Escreva um programa que leia a
idade de uma pessoa e determine se ela está apta a votar.
*  */
