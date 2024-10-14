package lista01.exercicio39;

import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrixOne = new int[2][2];
        int[][] matrixTwo = new int[2][2];
        int[][] matrixResult = new int[2][2];


        System.out.println("Preencha os valores primeira matriz 2x2: ");
        for(int i = 0; i < matrixOne.length; i++){
            for(int j = 0; j < matrixOne.length; j++){
                matrixOne[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Preencha os valores da segunda matriz 2x2: ");
        for(int i = 0; i < matrixTwo.length; i++){
            for(int j = 0; j < matrixTwo.length; j++){
                matrixTwo[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Resultado da multiplicação dos elementos: ");
        for(int i = 0; i < matrixResult.length; i++){
            for(int j = 0; j < matrixResult.length; j++){
                matrixResult[i][j] = matrixOne[i][j] * matrixTwo[i][j];
                System.out.println("Resultado: " + matrixResult[i][j]);
            }
        }


    }
}
