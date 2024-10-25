package lista02.exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor do primeiro lado do retângulo: ");
        double lado01 = Double.parseDouble(scanner.nextLine());
        System.out.println("Entre com o valor do segundo lado do retângulo: ");
        double lado02 = Double.parseDouble(scanner.nextLine());
        System.out.println("Entre com a unidade de medida: ");
        String unidadeMedida = scanner.nextLine();

        System.out.println("Área do retângulo: " + AreaRetangulo(lado01, lado02) + " " + unidadeMedida + "²");

    }

    public static double AreaRetangulo(double l1, double l2) {
        return l1 * l2;
    }
}
