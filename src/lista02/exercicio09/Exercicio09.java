package lista02.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double firstSide;
        double secondSide;
        String measureUnit;

        System.out.println("Entre com o valor do primeiro lado do retângulo: ");
        firstSide = Double.parseDouble(scanner.nextLine());

        System.out.println("Entre com o valor do segundo lado do retângulo: ");
        secondSide = Double.parseDouble(scanner.nextLine());

        System.out.println("Entre com a unidade de medida: ");
        measureUnit = scanner.nextLine();

        System.out.println("Área do retângulo: " + rectangleArea(firstSide, secondSide) + " " + measureUnit + "²");

    }

    public static double rectangleArea(double firstSide, double secondSide) {
        return firstSide * secondSide;
    }
}
