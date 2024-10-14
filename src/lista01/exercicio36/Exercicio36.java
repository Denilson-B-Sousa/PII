package lista01.exercicio36;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int sum = 0;

        System.out.println("Preencha os valores da matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scanner.nextInt();
                sum += matriz[i][j];
            }
        }

        System.out.println("Soma dos elementos da matriz: ");
        System.out.println(sum);

    }
}
