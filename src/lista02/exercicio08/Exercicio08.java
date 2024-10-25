package lista02.exercicio08;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o raio do círculo: ");
        double raio = scanner.nextInt();

        double areaCircle = Math.PI * (Math.pow(raio, 2));

        System.out.println("Área do círculo: " + String.format("%.1f" + areaCircle));
    }
}
