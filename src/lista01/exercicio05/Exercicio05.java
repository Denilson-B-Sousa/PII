package lista01.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double hour;
        double minutes;
        double seconds;

        System.out.println("Entre com o tempo em horas: ");
        hour = Double.parseDouble(scanner.nextLine());

        minutes = hour * 60;
        seconds = hour * 3600;

        System.out.println("O tempo em minutos: " + String.format("%.0f", minutes) + " minutes");
        System.out.println("O tempo em segundos: " + String.format("%.0f", seconds) + " seconds");

    }
}

/*
* Conversão de horas: Faça um programa que converta um tempo em
horas para minutos e segundos.
* */