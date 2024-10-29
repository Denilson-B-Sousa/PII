package lista02.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circleArea;
        String measureUnit;

        System.out.println("Entre com o raio do círculo: ");
        radius = Double.parseDouble(scanner.nextLine());

        System.out.println("Entre com a unidade de medida utilizada: ");
        measureUnit = scanner.nextLine();

        circleArea = Math.PI * (Math.pow(radius, 2));

        System.out.println("Área do círculo: " + String.format("%.1f", circleArea) + " " + measureUnit + "²");
    }
}
