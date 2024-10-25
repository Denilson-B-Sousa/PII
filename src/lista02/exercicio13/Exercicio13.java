package lista02.exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a coordenada do primeiro ponto: ");

        System.out.print("X: ");
        int x1 = scanner.nextInt();

        System.out.print("Y: ");
        int y1 = scanner.nextInt();

        System.out.println("Entre com a coordenada do segundo ponto: ");

        System.out.print("X: ");
        int x2 = scanner.nextInt();

        System.out.print("Y: ");
        int y2 = scanner.nextInt();

        System.out.println("Distância entre os dois pontos: " + String.format("%.2f", calcularDistancia(x1, y1, x2, y2)));

    }

    public static double calcularDistancia(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
