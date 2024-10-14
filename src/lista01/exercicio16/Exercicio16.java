package lista01.exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int februaryDays;

        System.out.println("Entre com quantidade de dias do mês de fevereiro: ");
        februaryDays = scanner.nextInt();

        if(februaryDays == 29) {
            System.out.println("Ano bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }

    }
}

/*
16.Ano bissexto: Construa um programa que determine se um ano é
bissexto ou não
*/
