package lista01.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;
        int ageInDays;

        System.out.println("Entre com a idade em anos: ");
        age = scanner.nextInt();

        ageInDays = age * 365;

        System.out.println("Sua idade em dias: " + ageInDays);


    }
}

/*
* 7. Idade em dias: Faça um programa que leia sua idade em anos e
converta para dias.
* */