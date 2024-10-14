package lista01.exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double side1;
        double side2;
        double side3;

        System.out.println("Entre com o valor do primeiro lado do triângulo: ");
        side1 = scanner.nextDouble();
        System.out.println("Entre com o valor do segundo lado do triângulo: ");
        side2 = scanner.nextDouble();
        System.out.println("Entre com o o valor do terceiro lado do triângulo: ");
        side3 = scanner.nextDouble();

        if(side1 == side2 && side2 == side3) {
            System.out.println("Triângulo equilátero.");
        } else if(side1 == side2 || side1 == side3 || side2 == side3 ) {
            System.out.println("Triângulo isósceles.");
        } else {
            System.out.println("Triângulo escaleno.");
        }

    }
}

/*
* 15.Classificação de triângulo: Faça um programa que leia os três lados
de um triângulo e classifique-o como equilátero, isósceles ou
escaleno.

*  */