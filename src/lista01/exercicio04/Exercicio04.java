package lista01.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius;
        String unity;

        System.out.println("Entre com o raio do círculo: ");
        radius = Double.parseDouble(scanner.nextLine());

        System.out.println("Entre com a unidade de medida: [m] metros, [cm] centímetros, [mm] milímetros");
        unity = scanner.nextLine();

        if(unity.equals("m") ||  unity.equals("cm") ||  unity.equals("mm") ||  unity.equals("km")) {
            double circleArea = Math.PI * Math.pow(radius, 2);

            System.out.println("\nÁrea do círculo: " + String.format("%.2f", circleArea) + " " + unity);
        } else {
            System.out.println("Entre com uma unidade de media válida!");
        }

    }
}


/*
* 4. Área do círculo: Escreva um programa que leia o raio de um círculo
e calcule sua área.

*
* */