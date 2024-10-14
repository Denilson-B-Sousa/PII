package lista01.exercicio38;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int sum = 0;

        System.out.println("Entre com os elementos da matriz 4x4:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < 4; i++) {
            sum += matriz[i][i];
        }

        System.out.println("Elementos da diagonal principal: " + sum);
    }
}
