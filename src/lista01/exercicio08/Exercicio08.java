package lista01.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double base;
        double height;
        double area;
        String unity;

        System.out.println("Entre com a base de um retângulo: ");
        base = Double.parseDouble(scanner.nextLine());
        System.out.println("Entre com a altura do retângulo: ");
        height = Double.parseDouble(scanner.nextLine());
        System.out.println("Entre com a unidade de medida: ");
        unity = scanner.nextLine();

        area = base * height;

        System.out.println("Área do triângulo: " + area + " " + unity);
    }
}

/*
* 8. Cálculo de área de um retângulo: Escreva um programa que leia a
base e a altura de um retângulo e calcule a sua área
* */